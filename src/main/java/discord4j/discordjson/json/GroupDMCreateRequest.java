package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutableGroupDMCreateRequest.class)
@JsonDeserialize(as = ImmutableGroupDMCreateRequest.class)
public interface GroupDMCreateRequest {

    @JsonProperty("access_tokens")
    List<String> accessTokens();
    Map<String, String> nicks();
}
