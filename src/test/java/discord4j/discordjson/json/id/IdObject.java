package discord4j.discordjson.json.id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIdObject.class)
@JsonDeserialize(as = ImmutableIdObject.class)
public interface IdObject {

    Id id();
}
