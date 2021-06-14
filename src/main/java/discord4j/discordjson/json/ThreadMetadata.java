package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadMetadata.class)
@JsonDeserialize(as = ImmutableThreadMetadata.class)
public interface ThreadMetadata {

    static ImmutableThreadMetadata.Builder builder() {
        return ImmutableThreadMetadata.builder();
    }

    boolean archived();

    @JsonProperty("auto_archive_duration")
    int autoArchiveDuration();

    @JsonProperty("archive_timestamp")
    String archiveTimestamp();

    Possible<Boolean> locked();
}
