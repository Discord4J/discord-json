package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableResolvedChannelData.class)
@JsonDeserialize(as = ImmutableResolvedChannelData.class)
public interface ResolvedChannelData {

    static ImmutableResolvedChannelData.Builder builder() {
        return ImmutableResolvedChannelData.builder();
    }

    String id();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Optional<String>> name();

    int type();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Optional<String>> permissions();

}
