package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageCreateRequest.class)
@JsonDeserialize(as = ImmutableMessageCreateRequest.class)
public interface MessageCreateRequest extends MessageSendRequestBase {
    static ImmutableMessageCreateRequest.Builder builder() {
        return ImmutableMessageCreateRequest.builder();
    }

    Possible<Object> nonce();

    @JsonProperty("enforce_nonce")
    Possible<Boolean> enforceNonce();

    @Deprecated
    Possible<EmbedData> embed();

    @JsonProperty("sticker_ids")
    Possible<List<Id>> stickerIds();
}
