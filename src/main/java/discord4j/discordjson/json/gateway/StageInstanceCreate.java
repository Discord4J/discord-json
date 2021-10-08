package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.StageInstanceData;
import discord4j.discordjson.json.UserData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStageInstanceCreate.class)
@JsonDeserialize(as = ImmutableStageInstanceCreate.class)
public interface StageInstanceCreate extends Dispatch {

    static ImmutableStageInstanceCreate.Builder builder() {
        return ImmutableStageInstanceCreate.builder();
    }

    @JsonUnwrapped
    StageInstanceData stageInstance();
}
