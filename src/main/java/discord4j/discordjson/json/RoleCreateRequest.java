package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleCreateRequest.class)
@JsonDeserialize(as = ImmutableRoleCreateRequest.class)
public interface RoleCreateRequest {

    static ImmutableRoleCreateRequest.Builder builder() {
        return ImmutableRoleCreateRequest.builder();
    }

    Possible<String> name();
    Possible<Long> permissions();
    Possible<Integer> color();
    Possible<Boolean> hoist();
    Possible<Boolean> mentionable();
    Possible<Optional<String>> icon();
    @JsonProperty("unicode_emoji")
    Possible<Optional<String>> unicodeEmoji();
}
