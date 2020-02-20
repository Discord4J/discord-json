package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageApplicationData.class)
public interface MessageApplicationData {

    String id();

    @JsonProperty("cover_image")
    default Possible<String> coverImage() { return Possible.absent(); }

    String description();

    Optional<String> icon();

    String name();
}
