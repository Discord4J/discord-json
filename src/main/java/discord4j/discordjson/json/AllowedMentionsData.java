package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAllowedMentionsData.class)
@JsonDeserialize(as = ImmutableAllowedMentionsData.class)
public interface AllowedMentionsData {

    static ImmutableAllowedMentionsData.Builder builder() {
        return ImmutableAllowedMentionsData.builder();
    }

    Possible<List<String>> parse();

    Possible<List<Id>> roles();

    Possible<List<Id>> users();

    @JsonProperty("replied_user")
    Possible<Boolean> repliedUser();

}
