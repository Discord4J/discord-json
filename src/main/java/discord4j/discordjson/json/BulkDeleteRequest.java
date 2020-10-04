package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableBulkDeleteRequest.class)
@JsonDeserialize(as = ImmutableBulkDeleteRequest.class)
public interface BulkDeleteRequest {

    static ImmutableBulkDeleteRequest.Builder builder() {
        return ImmutableBulkDeleteRequest.builder();
    }

    List<Id> messages();
}
