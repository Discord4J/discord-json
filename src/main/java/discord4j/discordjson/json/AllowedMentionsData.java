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

    default Possible<List<String>> parse() { return Possible.absent(); }

    default Possible<List<String>> roles() { return Possible.absent(); }

    default Possible<List<String>> users() { return Possible.absent(); }

}
