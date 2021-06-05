package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ActivityUpdateRequest;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStatusUpdate.class)
@JsonDeserialize(as = ImmutableStatusUpdate.class)
public interface StatusUpdate extends PayloadData {

    static ImmutableStatusUpdate.Builder builder() {
        return ImmutableStatusUpdate.builder();
    }

    Optional<Long> since();

    List<ActivityUpdateRequest> activities();

    String status();

    boolean afk();
}
