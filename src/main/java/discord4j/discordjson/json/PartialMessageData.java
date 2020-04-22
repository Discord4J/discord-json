package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialMessageData.class)
@JsonDeserialize(as = ImmutablePartialMessageData.class)
public interface PartialMessageData {

    static ImmutablePartialMessageData.Builder builder() {
        return ImmutablePartialMessageData.builder();
    }

    String id();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    Possible<? extends String> guildId();

    Possible<? extends UserData> author();

    Possible<? extends PartialMemberData> member();

    Possible<? extends String> content();

    Possible<? extends String> timestamp();

    @JsonProperty("edited_timestamp")
    Optional<String> editedTimestamp();

    Possible<? extends Boolean> tts();

    @JsonProperty("mention_everyone")
    Possible<? extends Boolean> mentionEveryone();

    List<UserWithMemberData> mentions();

    @JsonProperty("mention_roles")
    List<String> mentionRoles();

    @JsonProperty("mention_channels")
    Possible<List<ChannelMentionData>> mentionChannels();

    List<AttachmentData> attachments();

    List<EmbedData> embeds();

    Possible<List<ReactionData>> reactions();

    Possible<? extends Object> nonce();

    Possible<? extends Boolean> pinned();

    @JsonProperty("webhook_id")
    Possible<? extends String> webhookId();

    Possible<? extends Integer> type();

    Possible<? extends MessageActivityData> activity();

    Possible<? extends MessageApplicationData> application();

    @JsonProperty("message_reference")
    Possible<? extends MessageReferenceData> messageReference();

    Possible<? extends Integer> flags();
}
