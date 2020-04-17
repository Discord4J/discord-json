package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageData.class)
@JsonDeserialize(as = ImmutableMessageData.class)
public interface MessageData {

    String id();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    Possible<String> guildId();

    UserData author();

    Possible<PartialMemberData> member();

    String content();

    String timestamp();

    @JsonProperty("edited_timestamp")
    Optional<String> editedTimestamp();

    boolean tts();

    @JsonProperty("mention_everyone")
    boolean mentionEveryone();

    List<UserWithMemberData> mentions();

    @JsonProperty("mention_roles")
    List<String> mentionRoles();

    @JsonProperty("mention_channels")
    Possible<List<ChannelMentionData>> mentionChannels();

    List<AttachmentData> attachments();

    List<EmbedData> embeds();

    Possible<List<ReactionData>> reactions();

    Possible<Object> nonce();

    boolean pinned();

    @JsonProperty("webhook_id")
    Possible<String> webhookId();

    int type();

    Possible<MessageActivityData> activity();

    Possible<MessageApplicationData> application();

    @JsonProperty("message_reference")
    Possible<MessageReferenceData> messageReference();

    Possible<Integer> flags();

}
