package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GatewayDeserializationTest {
    
    private static final Logger log = LoggerFactory.getLogger(GatewayDeserializationTest.class);

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
                .setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.CUSTOM, JsonInclude.Include.ALWAYS, PossibleFilter.class, null));
    }

    @Test
    public void testChannelCreate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/ChannelCreate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testChannelDelete() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/ChannelDelete.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testChannelPinsUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/ChannelPinsUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testChannelUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/ChannelUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildBanAdd() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildBanAdd.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildBanRemove() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildBanRemove.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildCreate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildCreate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildDelete() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildDelete.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildEmojisUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildEmojisUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMemberAdd() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildMemberAdd.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMemberRemove() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildMemberRemove.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMembersChunk() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildMembersChunk.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMemberUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildMemberUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildRoleCreate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildRoleCreate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildRoleDelete() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildRoleDelete.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildRoleUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildRoleUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/GuildUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testHello() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/Hello.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageCreate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/MessageCreate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageDelete() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/MessageDelete.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageReactionAdd() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/MessageReactionAdd.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageReactionRemove() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/MessageReactionRemove.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/MessageUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testPresenceUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/PresenceUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testReady() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/Ready.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testTypingStart() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/TypingStart.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testVoiceStateUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/VoiceStateUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testWebhooksUpdate() throws IOException {
        GatewayPayload<?> json = mapper.readValue(getClass().getResourceAsStream("/gateway/WebhooksUpdate.json"),
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }
}
