package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableBulkDeleteRequest.class)
public interface BulkDeleteRequest {

    List<String> messages();
}
