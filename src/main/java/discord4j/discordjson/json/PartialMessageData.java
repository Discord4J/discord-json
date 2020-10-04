package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
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

    Id id();

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    Possible<UserData> author();

    Possible<PartialMemberData> member();

    Possible<String> content();

    Possible<String> timestamp();

    @JsonProperty("edited_timestamp")
    Optional<String> editedTimestamp();

    Possible<Boolean> tts();

    @JsonProperty("mention_everyone")
    Possible<Boolean> mentionEveryone();

    List<UserWithMemberData> mentions();

    @JsonProperty("mention_roles")
    List<String> mentionRoles();

    @JsonProperty("mention_channels")
    Possible<List<ChannelMentionData>> mentionChannels();

    List<AttachmentData> attachments();

    List<EmbedData> embeds();

    Possible<List<ReactionData>> reactions();

    Possible<Object> nonce();

    Possible<Boolean> pinned();

    @JsonProperty("webhook_id")
    Possible<Id> webhookId();

    Possible<Integer> type();

    Possible<MessageActivityData> activity();

    Possible<MessageApplicationData> application();

    @JsonProperty("message_reference")
    Possible<MessageReferenceData> messageReference();

    Possible<Integer> flags();

    Possible<List<StickerData>> stickers();

    @JsonProperty("referenced_message")
    Possible<Optional<MessageData>> referencedMessage();

}
