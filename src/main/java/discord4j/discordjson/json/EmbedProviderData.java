package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedProviderData.class)
@JsonDeserialize(as = ImmutableEmbedProviderData.class)
public interface EmbedProviderData {

    default Possible<String> name() { return Possible.absent(); }

    // TODO [wtf-docs] embed provider can be null
    default Possible<Optional<String>> url() { return Possible.absent(); }
}