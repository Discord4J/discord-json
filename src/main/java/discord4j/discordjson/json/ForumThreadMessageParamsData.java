package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableForumThreadMessageParamsData.class)
@JsonDeserialize(as = ImmutableForumThreadMessageParamsData.class)
public interface ForumThreadMessageParamsData {

    static ImmutableForumThreadMessageParamsData.Builder builder() {
        return ImmutableForumThreadMessageParamsData.builder();
    }

    Possible<String> content();

    Possible<List<EmbedData>> embeds();

    @JsonProperty("allowed_mentions")
    Possible<AllowedMentionsData> allowedMentions();

    Possible<List<ComponentData>> components();

    @JsonProperty("sticker_ids")
    Possible<List<Id>> stickerIds();

    List<AttachmentData> attachments();

    Possible<Integer> flags();

}
