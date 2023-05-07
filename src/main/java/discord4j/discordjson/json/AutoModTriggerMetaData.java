package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModTriggerMetaData.class)
@JsonDeserialize(as = ImmutableAutoModTriggerMetaData.class)
public interface AutoModTriggerMetaData {

    static ImmutableAutoModTriggerMetaData.Builder builder() {
        return ImmutableAutoModTriggerMetaData.builder();
    }

    @JsonProperty("keyword_filter")
    Possible<List<String>> keywordFilter();

    @JsonProperty("regex_patterns")
    Possible<List<String>> regexPatterns();

    Possible<List<Integer>> presets();

    @JsonProperty("allow_list")
    Possible<List<String>> allowList();

    @JsonProperty("mention_total_limit")
    Possible<Integer> mentionTotalLimit();

    @JsonProperty("mention_raid_protection_enabled")
    Possible<Boolean> mentionRaidProtectionEnabled();

}
