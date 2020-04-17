package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRegionData.class)
@JsonDeserialize(as = ImmutableRegionData.class)
public interface RegionData {

    static ImmutableRegionData.Builder builder() {
        return ImmutableRegionData.builder();
    }

    String id();
    String name();
    boolean vip();
    boolean optimal();
    boolean deprecated();
    boolean custom();
}
