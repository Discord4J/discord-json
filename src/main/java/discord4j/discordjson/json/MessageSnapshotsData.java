package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageSnapshotsData.class)
@JsonDeserialize(as = ImmutableMessageSnapshotsData.class)
public interface MessageSnapshotsData {

    static ImmutableMessageSnapshotsData.Builder builder() {
        return ImmutableMessageSnapshotsData.builder();
    }

    PartialMessageData message();

}
