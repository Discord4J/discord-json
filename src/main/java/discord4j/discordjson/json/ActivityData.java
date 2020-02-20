package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityData.class)
public interface ActivityData {

    String name();

    int type();

    default Possible<Optional<String>> url() { return Possible.absent(); }

    @JsonProperty("created_at")
    int createdAt();

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
