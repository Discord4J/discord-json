package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableBulkBanRequest.class)
@JsonDeserialize(as = ImmutableBulkBanRequest.class)
public interface BulkBanRequest {

    static ImmutableBulkBanRequest.Builder builder() {
        return ImmutableBulkBanRequest.builder();
    }

    @JsonProperty("user_ids")
    List<Id> userIds();

    @JsonProperty("delete_message_seconds")
    Possible<Integer> deleteMessageSeconds();
}
