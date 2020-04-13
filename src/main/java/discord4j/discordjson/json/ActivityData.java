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

    String id();

    default Possible<Optional<String>> url() { return Possible.absent(); }

    @JsonProperty("created_at")
    long createdAt();

    default Possible<ActivityTimestampsData> timestamps() { return Possible.absent(); }

    @JsonProperty("application_id")
    default Possible<String> applicationId() { return Possible.absent(); }

    default Possible<Optional<String>> details() { return Possible.absent(); }

    default Possible<Optional<String>> state() { return Possible.absent(); }

    default Possible<Optional<ActivityEmojiData>> emoji() { return Possible.absent(); }

    default Possible<ActivityPartyData> party() { return Possible.absent(); }

    default Possible<ActivityAssetsData> assets() { return Possible.absent(); }

    default Possible<ActivitySecretsData> secrets() { return Possible.absent(); }

    default Possible<Boolean> instance() { return Possible.absent(); }

    default Possible<Integer> flags() { return Possible.absent(); }
}