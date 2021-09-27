package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStageInstanceModifyRequest.class)
@JsonDeserialize(as = ImmutableStageInstanceModifyRequest.class)
public interface StageInstanceModifyRequest {

    static ImmutableStageInstanceModifyRequest.Builder builder() {
        return ImmutableStageInstanceModifyRequest.builder();
    }

    Possible<String> topic();
    Possible<Integer> privacyLevel();
}
