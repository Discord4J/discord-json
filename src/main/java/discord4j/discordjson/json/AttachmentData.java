package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableAttachmentData.class)
@JsonDeserialize(as = ImmutableAttachmentData.class)
public interface AttachmentData extends PartialAttachmentData {

    static ImmutableAttachmentData.Builder builder() {
        return ImmutableAttachmentData.builder();
    }

    int size();

    String url();

    @JsonProperty("proxy_url")
    String proxyUrl();

    Possible<Optional<Integer>> height();

    Possible<Optional<Integer>> width();

    Possible<Boolean> ephemeral();

    @JsonProperty("duration_secs")
    Possible<Float> durationSeconds();

    Possible<String> waveform();

    Possible<Integer> flags();
}
