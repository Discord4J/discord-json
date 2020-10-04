package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildWidgetModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildWidgetModifyRequest.class)
public interface GuildWidgetModifyRequest {

    static ImmutableGuildWidgetModifyRequest.Builder builder() {
        return ImmutableGuildWidgetModifyRequest.builder();
    }

    Possible<Boolean> enabled();

    @JsonProperty("channel_id")
    Possible<Optional<Id>> channelId();
}