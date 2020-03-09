package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ActivityData;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStatusUpdate.class)
@JsonDeserialize(as = ImmutableStatusUpdate.class)
public interface StatusUpdate extends PayloadData {

    Optional<Long> since();
    Optional<ActivityData> game();
    String status();
    boolean afk();
}
