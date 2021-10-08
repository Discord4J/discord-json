package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.StageInstanceData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStageInstanceDelete.class)
@JsonDeserialize(as = ImmutableStageInstanceDelete.class)
public interface StageInstanceDelete extends Dispatch {

    static ImmutableStageInstanceDelete.Builder builder() {
        return ImmutableStageInstanceDelete.builder();
    }

    @JsonUnwrapped
    StageInstanceData stageInstance();
}
