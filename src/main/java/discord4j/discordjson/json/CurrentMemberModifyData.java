package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableCurrentMemberModifyData.class)
@JsonDeserialize(as = ImmutableCurrentMemberModifyData.class)
public interface CurrentMemberModifyData {

    static ImmutableCurrentMemberModifyData.Builder builder() {
        return ImmutableCurrentMemberModifyData.builder();
    }

    Possible<Optional<String>> nick();

    Possible<Optional<String>> banner();

    Possible<Optional<String>> avatar();

    Possible<Optional<String>> bio();
}
