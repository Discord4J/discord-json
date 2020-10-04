package discord4j.discordjson.json.id;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IdTests {

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
    public void testIdDeserialization() throws JsonProcessingException {
        String source = "{\"id\":\"1234567890\"}";
        IdObject obj = mapper.readValue(source, IdObject.class);
        assertEquals(1234567890, obj.id().asLong());
    }

    @Test
    public void testIdSerialization() throws JsonProcessingException {
        String expected = "{\"id\":\"1234567890\"}";
        IdObject obj = ImmutableIdObject.builder().id(1234567890L).build();
        assertEquals(expected, mapper.writeValueAsString(obj));
    }

    @Test
    public void testPresentPossibleIdDeserialization() throws JsonProcessingException {
        String source = "{\"id\":\"1234567890\"}";
        PossibleIdObject obj = mapper.readValue(source, PossibleIdObject.class);
        assertEquals(1234567890, obj.id().get().asLong());
    }

    @Test
    public void testAbsentPossibleIdDeserialization() throws JsonProcessingException {
        String source = "{}";
        PossibleIdObject obj = mapper.readValue(source, PossibleIdObject.class);
        assertTrue(obj.id().isAbsent());
    }

    @Test
    public void testPresentPossibleIdSerialization() throws JsonProcessingException {
        String expected = "{\"id\":\"1234567890\"}";
        PossibleIdObject obj = ImmutablePossibleIdObject.builder().id(1234567890L).build();
        assertEquals(expected, mapper.writeValueAsString(obj));
    }

    @Test
    public void testAbsentPresentPossibleIdSerialization() throws JsonProcessingException {
        String expected = "{}";
        PossibleIdObject obj = ImmutablePossibleIdObject.builder().build();
        assertEquals(expected, mapper.writeValueAsString(obj));
    }
}
