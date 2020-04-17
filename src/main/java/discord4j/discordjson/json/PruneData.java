package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePruneData.class)
@JsonDeserialize(as = ImmutablePruneData.class)
public interface PruneData {

    static ImmutablePruneData.Builder builder() {
        return ImmutablePruneData.builder();
    }

    int pruned();
}
