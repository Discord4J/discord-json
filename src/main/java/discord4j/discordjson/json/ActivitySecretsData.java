package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableActivitySecretsData.class)
@JsonDeserialize(as = ImmutableActivitySecretsData.class)
public interface ActivitySecretsData {

    static ImmutableActivitySecretsData.Builder builder() {
        return ImmutableActivitySecretsData.builder();
    }

    Possible<String> join();

    Possible<String> spectate();

    Possible<String> match();
}
