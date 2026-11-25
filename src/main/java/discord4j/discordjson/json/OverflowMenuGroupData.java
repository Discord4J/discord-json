package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableOverflowMenuGroupData.class)
@JsonDeserialize(as = ImmutableOverflowMenuGroupData.class)
public interface OverflowMenuGroupData {

    static ImmutableOverflowMenuGroupData.Builder builder() {
        return ImmutableOverflowMenuGroupData.builder();
    }

    Possible<Optional<String>> label();

    List<ComponentData> components();

}
