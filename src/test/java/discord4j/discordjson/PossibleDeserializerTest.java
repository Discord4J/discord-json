package discord4j.discordjson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.json.EmbedData;
import discord4j.discordjson.json.Foo;
import discord4j.discordjson.json.ImmutableFoo;
import discord4j.discordjson.json.MyJson;
import discord4j.discordjson.possible.Possible;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PossibleDeserializerTest {

    ObjectMapper mapper;

    @BeforeEach
    public void setUp() {
        mapper = new ObjectMapper()
                .registerModule(new PossibleModule())
                .registerModule(new Jdk8Module())
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.CUSTOM,
                        JsonInclude.Include.ALWAYS, PossibleFilter.class, null));
    }

    @Test
    public void testPresent() throws IOException {
        MyJson json = mapper.readValue(getClass().getResourceAsStream("/singleFieldPresent.json"), MyJson.class);

        assertEquals(Possible.of(Optional.of("isHere")), json.myField());
    }

    @Test
    public void testNull() throws IOException {
        MyJson json = mapper.readValue(getClass().getResourceAsStream("/singleFieldNull.json"), MyJson.class);

        assertEquals(Possible.of(Optional.empty()), json.myField());
    }

    @Test
    public void testAbsent() throws IOException {
        MyJson json = mapper.readValue(getClass().getResourceAsStream("/singleFieldAbsent.json"), MyJson.class);

        assertEquals(Possible.absent(), json.myField());
    }

    @Test
    public void testPossibleOptionalEncoding() {
        Foo foo = ImmutableFoo.builder()
                .addList("element")
                .optionalOrNull("present")
                .possible("possible")
                .build();
        assertFalse(foo.list().isAbsent());
        assertEquals(1, foo.list().get().size());
        assertFalse(foo.optional().isAbsent());
        assertFalse(foo.possible().isAbsent());
    }

    @Test
    public void testReadNullAsPossibleAbsent() throws IOException {
        // Set up an alternate ObjectMapper that can deserialize
        // `"field": null` to a Possible<T> type by mapping it to a Possible.absent()
        // can work around Discord temporary issues or wrong library field types
        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new PossibleModule()
                        .configureReadNullAsAbsent(true))
                .registerModule(new Jdk8Module())
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.CUSTOM,
                        JsonInclude.Include.ALWAYS, PossibleFilter.class, null));
        EmbedData data = mapper.readValue(getClass().getResourceAsStream("/rest/EmbedData.NullAuthorUrl.json"), EmbedData.class);
        assertTrue(data.author().get().url().isAbsent());
    }
}
