package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityData.class)
@JsonDeserialize(as = ImmutableActivityData.class)
public interface ActivityData extends Activity {

    static ImmutableActivityData.Builder builder() {
        return ImmutableActivityData.builder();
    }

    String id();

    Possible<Optional<String>> url();

    @JsonProperty("created_at")
    long createdAt();

    Possible<ActivityTimestampsData> timestamps();

    @JsonProperty("application_id")
    Possible<String> applicationId();

    Possible<Optional<String>> details();

    Possible<Optional<String>> state();

    Possible<Optional<ActivityEmojiData>> emoji();

    Possible<ActivityPartyData> party();

    Possible<ActivityAssetsData> assets();

    Possible<ActivitySecretsData> secrets();

    Possible<Boolean> instance();

    Possible<Integer> flags();
}
