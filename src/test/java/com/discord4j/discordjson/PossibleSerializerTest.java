package com.discord4j.discordjson;

import com.darichey.discordjson.json.ImmutableMyJson;
import com.discord4j.discordjson.json.MyJson;
import com.discord4j.discordjson.possible.Possible;
import com.discord4j.discordjson.possible.PossibleFilter;
import com.discord4j.discordjson.possible.PossibleModule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class PossibleSerializerTest {

    ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper()
                .registerModule(new PossibleModule())
                .registerModule(new Jdk8Module())
                .setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.CUSTOM, JsonInclude.Include.ALWAYS, PossibleFilter.class, null));
    }

    @Test
    public void testPresent() throws IOException {
        MyJson myJson = ImmutableMyJson.of(Possible.of(Optional.of("isHere")));
        String serialized = mapper.writeValueAsString(myJson);

        String expected = read(getClass().getResourceAsStream("/singleFieldPresent.json"));

        assertEquals(expected, serialized);
    }

    @Test
    public void testNull() throws IOException {
        MyJson myJson = ImmutableMyJson.of(Possible.of(Optional.empty()));
        String serialized = mapper.writeValueAsString(myJson);

        String expected = read(getClass().getResourceAsStream("/singleFieldNull.json"));

        assertEquals(expected, serialized);
    }

    @Test
    public void testAbsent() throws IOException {
        MyJson myJson = ImmutableMyJson.of(Possible.absent());
        String serialized = mapper.writeValueAsString(myJson);

        String expected = read(getClass().getResourceAsStream("/singleFieldAbsent.json"));

        assertEquals(expected, serialized);
    }

    private static String read(InputStream in) {
        try (Stream<String> stream = new BufferedReader(new InputStreamReader(in)).lines()) {
            return stream.collect(Collectors.joining("\n"));
        }
    }
}
