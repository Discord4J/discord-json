package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableBanData.class)
@JsonDeserialize(as = ImmutableBanData.class)
public interface BanData {

    Optional<String> reason();
    UserData user();
}
