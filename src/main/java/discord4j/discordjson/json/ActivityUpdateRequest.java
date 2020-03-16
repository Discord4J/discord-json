package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityUpdateRequest.class)
@JsonDeserialize(as = ImmutableActivityUpdateRequest.class)
public interface ActivityUpdateRequest extends Activity {

    Optional<String> url();
}
