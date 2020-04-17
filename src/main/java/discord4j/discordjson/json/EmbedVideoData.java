package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedVideoData.class)
@JsonDeserialize(as = ImmutableEmbedVideoData.class)
public interface EmbedVideoData {

    Possible<String> url();

    Possible<Integer> height();

    Possible<Integer> width();
}
