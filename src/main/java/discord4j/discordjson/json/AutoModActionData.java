package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModActionData.class)
@JsonDeserialize(as = ImmutableAutoModActionData.class)
public interface AutoModActionData {

    static ImmutableAutoModActionData.Builder builder() {
        return ImmutableAutoModActionData.builder();
    }

    int type();

    Possible<AutoModActionMetaData> metadata();

}
