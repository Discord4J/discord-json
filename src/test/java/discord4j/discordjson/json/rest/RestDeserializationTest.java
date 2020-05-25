package discord4j.discordjson.json.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.json.*;
import discord4j.discordjson.possible.Possible;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    private <T> T read(String from, Class<T> into) throws IOException {
        return mapper.readValue(getClass().getResourceAsStream(from), into);
    }

    @Test
    public void testGetGuild() throws IOException {
        GuildUpdateData guild = read("/rest/Guild.json", GuildUpdateData.class);
        log.info("{}", guild);
    }

    @Test
    public void testGetCurrentUserGuilds() throws IOException {
        UserGuildData guild = read("/rest/UserGuildData.json", UserGuildData.class);
        log.info("{}", guild);
    }

    @Test
    public void testGetChannelInvites() throws IOException {
        InviteData[] invites = read("/rest/ChannelInvites.json", InviteData[].class);
        log.info("{}", Arrays.asList(invites));
    }

    @Test
    public void testCreateMessageResponse() throws IOException {
        MessageData res = read("/rest/CreateMessageResponse.json", MessageData.class);
        log.info("{}", res);
    }

    @Test
    public void testMessageCopyingCollectionMethods() throws IOException {
        MessageData res = read("/rest/CreateMessageResponse.json", MessageData.class);
        MessageData withReaction = MessageData.builder().from(res)
                .addReaction(ReactionData.builder()
                        .count(1)
                        .me(false)
                        .emoji(EmojiData.builder().id("1").build())
                        .build())
                .build();
        MessageData withThreeReactions = MessageData.builder().from(withReaction)
                .addAllReactions(Arrays.asList(
                        ReactionData.builder()
                                .count(1)
                                .me(false)
                                .emoji(EmojiData.builder().id("2").build())
                                .build(),
                        ReactionData.builder()
                                .count(1)
                                .me(false)
                                .emoji(EmojiData.builder().id("3").build())
                                .build()
                ))
                .build();
        assertTrue(withThreeReactions.reactions()
                .toOptional()
                .map(list -> list.size() == 3)
                .orElse(false));
        MessageData withTwoReactions = MessageData.builder().from(withReaction)
                .reactions(Arrays.asList(
                        ReactionData.builder()
                                .count(1)
                                .me(false)
                                .emoji(EmojiData.builder().id("2").build())
                                .build(),
                        ReactionData.builder()
                                .count(1)
                                .me(false)
                                .emoji(EmojiData.builder().id("3").build())
                                .build()
                ))
                .build();
        assertTrue(withTwoReactions.reactions()
                .toOptional()
                .map(list -> list.size() == 2)
                .orElse(false));
    }

    @Test
    public void testGetGuildPreview() throws IOException {
        GuildPreviewData guildPreview = mapper.readValue(getClass()
                .getResourceAsStream("/rest/GuildPreview.json"), GuildPreviewData.class);
        log.info("{}", guildPreview);
    }

    @Test
    public void createPartialGuildDataFromGuildData() {
        GuildData guildData = GuildData.builder()
                .id("id")
                .name("name")
                .verificationLevel(1)
                .ownerId("1234")
                .region("region")
                .afkTimeout(1)
                .defaultMessageNotifications(1)
                .explicitContentFilter(1)
                .mfaLevel(1)
                .addFeature("ONCE")
                .premiumTier(1)
                .joinedAt(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()))
                .large(false)
                .memberCount(1)
                .build();
        PartialGuildData partialGuildData = PartialGuildData.builder()
                .from((GuildFields) guildData)
                .build();
        assertEquals("id", partialGuildData.id());
        assertEquals(Possible.absent(), partialGuildData.owner());
        assertEquals(1, partialGuildData.verificationLevel());
        assertEquals(1, partialGuildData.features().size());
    }
}
