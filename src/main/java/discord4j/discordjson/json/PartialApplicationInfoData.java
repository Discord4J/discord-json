package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialApplicationInfoData.class)
@JsonDeserialize(as = ImmutablePartialApplicationInfoData.class)
public interface PartialApplicationInfoData {

    static ImmutablePartialApplicationInfoData.Builder builder() {
        return ImmutablePartialApplicationInfoData.builder();
    }

    String id();
    int flags();
}
