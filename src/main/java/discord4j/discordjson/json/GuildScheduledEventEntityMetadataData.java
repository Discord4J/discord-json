package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventEntityMetadataData.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventEntityMetadataData.class)
public interface GuildScheduledEventEntityMetadataData {

    static ImmutableGuildScheduledEventEntityMetadataData.Builder builder() {
        return ImmutableGuildScheduledEventEntityMetadataData.builder();
    }

    @JsonProperty("speaker_ids")
    Possible<List<Id>> speakerIds();

    Possible<String> location();
}
