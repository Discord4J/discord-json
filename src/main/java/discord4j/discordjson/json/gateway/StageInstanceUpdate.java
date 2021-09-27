package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.StageInstanceData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStageInstanceUpdate.class)
@JsonDeserialize(as = ImmutableStageInstanceUpdate.class)
public interface StageInstanceUpdate extends Dispatch {

    static ImmutableStageInstanceUpdate.Builder builder() {
        return ImmutableStageInstanceUpdate.builder();
    }

    @JsonUnwrapped
    StageInstanceData stageInstance();
}
