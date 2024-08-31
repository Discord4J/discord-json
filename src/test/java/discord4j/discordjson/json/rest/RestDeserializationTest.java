package discord4j.discordjson.json.rest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.*;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RestDeserializationTest {

    private static final Logger log = LoggerFactory.getLogger(RestDeserializationTest.class);

    ObjectMapper mapper;

    @BeforeEach
    public void setUp() {
        mapper = new ObjectMapper()
            .registerModule(new PossibleModule())
            .registerModule(new Jdk8Module())
            .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
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

    private <T> T read(String from, TypeReference<T> into) throws IOException {
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
    public void testCreateMessageWithForwardResponse() throws IOException {
        MessageData res = read("/rest/CreateMessageWithForwardResponse.json", MessageData.class);
        log.info("{}", res);
    }

    @Test
    public void testMessageCopyingCollectionMethods() throws IOException {
        MessageData res = read("/rest/CreateMessageResponse.json", MessageData.class);
        MessageData withReaction = MessageData.builder().from(res)
            .addReaction(ReactionData.builder()
                .count(1)
                .me(false)
                .meBurst(false)
                .countDetails(ReactionCountDetailsData.builder().normal(1).burst(0).build())
                .burstColors(Collections.emptyList())
                .emoji(EmojiData.builder().id("1").build())
                .build())
            .build();
        MessageData withThreeReactions = MessageData.builder().from(withReaction)
            .addAllReactions(Arrays.asList(
                ReactionData.builder()
                    .count(1)
                    .me(false)
                    .meBurst(false)
                    .countDetails(ReactionCountDetailsData.builder().normal(1).burst(0).build())
                    .burstColors(Collections.emptyList())
                    .emoji(EmojiData.builder().id("2").build())
                    .build(),
                ReactionData.builder()
                    .count(1)
                    .countDetails(ReactionCountDetailsData.builder().normal(1).burst(0).build())
                    .me(false)
                    .meBurst(false)
                    .burstColors(Collections.emptyList())
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
                    .meBurst(false)
                    .countDetails(ReactionCountDetailsData.builder().normal(0).burst(1).build())
                    .burstColors(Arrays.asList("#9be07d", "#45a065"))
                    .emoji(EmojiData.builder().id("2").build())
                    .build(),
                ReactionData.builder()
                    .count(1)
                    .me(false)
                    .meBurst(false)
                    .countDetails(ReactionCountDetailsData.builder().normal(0).burst(1).build())
                    .burstColors(Collections.singletonList("#9be07d"))
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
        GuildPreviewData data = read("/rest/GuildPreview.json", GuildPreviewData.class);
        assertEquals(Id.of("197038439483310086"), data.id());
        assertFalse(data.splash().isPresent());
        assertTrue(data.emojis().isEmpty());
        assertEquals(9, data.features().size());
    }

    @Test
    public void testGetGuildIntegrations() throws IOException {
        List<IntegrationData> list = read("/rest/v8/GuildIntegrations.json",
            new TypeReference<List<IntegrationData>>() {
            });
        assertEquals(list.get(0).account().name(), "Reacton");
    }

    @Test
    public void testGetMessage() throws IOException {
        MessageData message = read("/rest/Message.json", MessageData.class);
        log.info("{}", message);
        MessageData reply = read("/rest/Message.Reply.json", MessageData.class);
        log.info("{}", reply);
    }

    @Test
    public void testGuildMemberModify() throws IOException {
        MemberData data = read("/rest/v8/GuildMemberModify.json", MemberData.class);
        assertEquals(data.user().id(), Id.of("84745855399129088"));
    }

    @Test
    public void testCreateApplicationCommand() throws IOException {
        ApplicationCommandRequest request = read("/rest/CreateApplicationCommand.json", ApplicationCommandRequest.class);
        log.info("{}", request);
    }

    @Test
    public void testGetTemplate() throws IOException {
        TemplateData data = read("/rest/TemplateData.json", TemplateData.class);
        log.info("{}", data);
    }

    @Test
    public void testGetWelcomeScreen() throws IOException {
        WelcomeScreenData data = read("/rest/WelcomeScreen.json", WelcomeScreenData.class);
        log.info("{}", data);
    }

    @Test
    public void testApplicationWebhook() throws IOException {
        WebhookData data = read("/rest/ApplicationWebhook.json", WebhookData.class);
        log.info("{}", data);
    }

    @Test
    public void testChannelFollowedWebhook() throws IOException {
        WebhookData data = read("/rest/ChannelFollowedWebhook.json", WebhookData.class);
        log.info("{}", data);
    }

    @Test
    public void readApplicationCommandData() throws IOException {
        ApplicationCommandData[] data = read("/rest/ApplicationCommandData.json", ApplicationCommandData[].class);
        log.info("{}", Arrays.asList(data));
    }

    @Test
    public void readGuildOnboardingData() throws IOException {
        OnboardingData data = read("/rest/GuildOnboardingDataResponse.json", OnboardingData.class);
        log.info("{}", data);
    }

    @Test
    public void readAccessTokenData() throws IOException {
        AccessTokenData basic = read("/rest/AccessTokenData.Basic.json", AccessTokenData.class);
        log.info("{}", basic);
        AccessTokenData bot = read("/rest/AccessTokenData.Bot.json", AccessTokenData.class);
        log.info("{}", bot);
        AccessTokenData webhook = read("/rest/AccessTokenData.Webhook.json", AccessTokenData.class);
        log.info("{}", webhook);
    }

    @Test
    public void readEmbedData() throws IOException {
        EmbedData data = mapper.readValue(getClass().getResourceAsStream("/rest/EmbedData.NullAuthorUrl.json"), EmbedData.class);
        log.info("{}", data);
    }

    @Test
    public void readApplicationInfoData() throws IOException {
        ApplicationInfoData data = read("/rest/ApplicationInfoData.json", ApplicationInfoData.class);
        log.info("{}", data);
    }
}
