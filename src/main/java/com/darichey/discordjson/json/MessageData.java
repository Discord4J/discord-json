package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageData.class)
public interface MessageData {

    String id();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }

    UserData author();

    default Possible<MemberData> member() { return Possible.absent(); }

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
    default Possible<List<ChannelMentionData>> mentionChannels() { return Possible.absent(); }

    List<AttachmentData> attachments();

    List<EmbedData> embeds();

    default Possible<List<ReactionData>> reactions() { return Possible.absent(); }

    default Possible<Object> nonce() { return Possible.absent(); }

    boolean pinned();

    @JsonProperty("webhook_id")
    default Possible<String> webhookId() { return Possible.absent(); }

    int type();

    default Possible<MessageActivityData> activity() { return Possible.absent(); }

    default Possible<MessageApplicationData> application() { return Possible.absent(); }

    @JsonProperty("message_reference")
    default Possible<MessageReferenceData> messageReference() { return Possible.absent(); }

    default Possible<Integer> flags() { return Possible.absent(); }

    interface UserWithMemberData extends UserData {
        MemberData member();
    }
}
