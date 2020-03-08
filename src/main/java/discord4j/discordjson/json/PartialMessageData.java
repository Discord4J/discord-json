package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutablePartialMessageData.class)
public interface PartialMessageData {

    String id();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }

    default Possible<UserData> author() { return Possible.absent(); }

    default Possible<PartialMemberData> member() { return Possible.absent(); }

    default Possible<String> content() { return Possible.absent(); }

    default Possible<String> timestamp() { return Possible.absent(); }

    @JsonProperty("edited_timestamp")
    Optional<String> editedTimestamp();

    default Possible<Boolean> tts() { return Possible.absent(); }

    @JsonProperty("mention_everyone")
    default Possible<Boolean> mentionEveryone() { return Possible.absent(); }

    List<UserWithMemberData> mentions();

    @JsonProperty("mention_roles")
    List<String> mentionRoles();

    @JsonProperty("mention_channels")
    default Possible<List<ChannelMentionData>> mentionChannels() { return Possible.absent(); }

    List<AttachmentData> attachments();

    List<EmbedData> embeds();

    default Possible<List<ReactionData>> reactions() { return Possible.absent(); }

    default Possible<Object> nonce() { return Possible.absent(); }

    default Possible<Boolean> pinned() { return Possible.absent(); }

    @JsonProperty("webhook_id")
    default Possible<String> webhookId() { return Possible.absent(); }

    default Possible<Integer> type() { return Possible.absent(); }

    default Possible<MessageActivityData> activity() { return Possible.absent(); }

    default Possible<MessageApplicationData> application() { return Possible.absent(); }

    @JsonProperty("message_reference")
    default Possible<MessageReferenceData> messageReference() { return Possible.absent(); }

    default Possible<Integer> flags() { return Possible.absent(); }
}
