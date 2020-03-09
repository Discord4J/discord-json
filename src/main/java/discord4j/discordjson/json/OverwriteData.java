package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOverwriteData.class)
@JsonDeserialize(as = ImmutableOverwriteData.class)
public interface OverwriteData {

    String id();

    String type();

    long allow();

    long deny();
}
