package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAllowedMentionsData.class)
@JsonDeserialize(as = ImmutableAllowedMentionsData.class)
public interface AllowedMentionsData {

    Possible<List<String>> parse();

    Possible<List<String>> roles();

    Possible<List<String>> users();

}
