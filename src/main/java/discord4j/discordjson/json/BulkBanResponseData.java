package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableBulkBanResponseData.class)
@JsonDeserialize(as = ImmutableBulkBanResponseData.class)
public interface BulkBanResponseData {

    static ImmutableBulkBanResponseData.Builder builder() {
        return ImmutableBulkBanResponseData.builder();
    }

    @JsonProperty("banned_users")
    List<Id> bannedUsers();

    @JsonProperty("failed_users")
    List<Id> failedUsers();
}
