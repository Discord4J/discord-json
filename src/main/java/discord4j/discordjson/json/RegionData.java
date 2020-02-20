package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRegionData.class)
public interface RegionData {

    String id();
    String name();
    boolean vip();
    boolean optimal();
    boolean deprecated();
    boolean custom();
}
