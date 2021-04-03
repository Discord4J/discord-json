package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableResolvedChannelData.class)
@JsonDeserialize(as = ImmutableResolvedChannelData.class)
public interface ResolvedChannelData {

    static ImmutableResolvedChannelData.Builder builder() {
        return ImmutableResolvedChannelData.builder();
    }

    String id();

    String name();

    int type();

    String permissions();

}
