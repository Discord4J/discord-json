package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildDiscoveryData.class)
@JsonDeserialize(as = ImmutableGuildDiscoveryData.class)
public interface GuildDiscoveryData {

    static ImmutableGuildDiscoveryData.Builder builder() {
        return ImmutableGuildDiscoveryData.builder();
    }

    @JsonProperty("guild_id")
    String guildId();

    @JsonProperty("primary_category_id")
    Integer primaryCategoryId();

    Possible<List<String>> keywords();

    @JsonProperty("emoji_discoverability_enabled")
    Boolean emojiDiscoverabilityEnabled();

    @JsonProperty("partner_actioned_timestamp")
    Optional<String> partnerActionedTimestamp();

    @JsonProperty("partner_application_timestamp")
    Optional<String> partnerApplicationTimestamp();

    @JsonProperty("category_ids")
    Possible<List<Integer>> categoryIds();

}
