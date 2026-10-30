package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableContentScanMetadata.class)
@JsonDeserialize(as = ImmutableContentScanMetadata.class)
public interface ContentScanMetadata {

    static ImmutableContentScanMetadata.Builder builder() {
        return ImmutableContentScanMetadata.builder();
    }

    int flags();

}
