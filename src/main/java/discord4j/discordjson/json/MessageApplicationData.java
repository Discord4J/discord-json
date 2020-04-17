package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageApplicationData.class)
@JsonDeserialize(as = ImmutableMessageApplicationData.class)
public interface MessageApplicationData {

    String id();

    @JsonProperty("cover_image")
    Possible<String> coverImage();

    String description();

    Optional<String> icon();

    String name();
}
