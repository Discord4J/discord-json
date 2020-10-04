package discord4j.discordjson.json.id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePossibleIdObject.class)
@JsonDeserialize(as = ImmutablePossibleIdObject.class)
public interface PossibleIdObject {

    Possible<Id> id();
}
