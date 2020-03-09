package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePruneData.class)
@JsonDeserialize(as = ImmutablePruneData.class)
public interface PruneData {

    int pruned();
}
