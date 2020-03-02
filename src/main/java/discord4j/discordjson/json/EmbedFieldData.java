package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedFieldData.class)
public interface EmbedFieldData {

    String name();

    String value();

    default Possible<Boolean> inline() { return Possible.absent(); }
}
