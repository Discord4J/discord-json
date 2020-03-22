package discord4j.discordjson.json.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.json.*;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;

public class RestDeserializationTest {

    private static final Logger log = LoggerFactory.getLogger(RestDeserializationTest.class);

    ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper()
                .registerModule(new PossibleModule())
                .registerModule(new Jdk8Module())
                .addHandler(new DeserializationProblemHandler() {
                    @Override
                    public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p, JsonDeserializer<
                            ?> deserializer, Object beanOrClass, String propertyName) throws IOException {
                        log.warn("Unknown property in {}: {}", beanOrClass, propertyName);
                        p.skipChildren();
                        return true;
                    }
                })
                .setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.CUSTOM,
                        JsonInclude.Include.ALWAYS, PossibleFilter.class, null));
    }

    @Test
    public void testGetGuild() throws IOException {
        GuildUpdateData guild = mapper.readValue(getClass().getResourceAsStream("/rest/Guild.json"), GuildUpdateData.class);
        log.info("{}", guild);
    }

    @Test
    public void testGetCurrentUserGuilds() throws IOException {
        UserGuildData guild = mapper.readValue(getClass().getResourceAsStream("/rest/UserGuildData.json"), UserGuildData.class);
        log.info("{}", guild);
    }

    @Test
    public void testGetChannelInvites() throws IOException {
        InviteData[] invites = mapper.readValue(getClass().getResourceAsStream("/rest/ChannelInvites.json"), InviteData[].class);
        log.info("{}", Arrays.asList(invites));
    }

    @Test
    public void testCreateMessageResponse() throws IOException {
        MessageData res = mapper.readValue(getClass().getResourceAsStream("/rest/CreateMessageResponse.json"), MessageData.class);
        log.info("{}", res);
    }

    @Test
    public void testGetGuildPreview() throws IOException {
        GuildPreviewData guildPreview = mapper.readValue(getClass()
                .getResourceAsStream("/rest/GuildPreview.json"), GuildPreviewData.class);
        log.info("{}", guildPreview);
    }
}
