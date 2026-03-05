package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialRoleDataFields.class)
@JsonDeserialize(as = ImmutablePartialRoleDataFields.class)
public interface PartialRoleDataFields {

    static ImmutablePartialRoleDataFields.Builder builder() {
        return ImmutablePartialRoleDataFields.builder();
    }

    Id id();

    String name();

    int position();

    RoleColorData colors();

    Possible<Optional<String>> icon();

    @JsonProperty("unicode_emoji")
    Possible<Optional<String>> unicodeEmoji();

}
