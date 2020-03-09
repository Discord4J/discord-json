package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedProviderData.class)
@JsonDeserialize(as = ImmutableEmbedProviderData.class)
public interface EmbedProviderData {

    default Possible<String> name() { return Possible.absent(); }

    default Possible<String> url() { return Possible.absent(); }
}
