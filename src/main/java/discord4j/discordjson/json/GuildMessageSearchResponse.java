package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMessageSearchResponse.class)
@JsonDeserialize(as = ImmutableGuildMessageSearchResponse.class)
public interface GuildMessageSearchResponse {

    @JsonProperty("doing_deep_historical_index")
    boolean doingDeepHistoricalIndex();

    @JsonProperty("documents_indexed")
    Possible<Integer> documentsIndexed();

    @JsonProperty("total_results")
    int totalResults();

    List<List<MessageData>> messages();

    Possible<List<ChannelData>> threads();

    Possible<List<ThreadMemberData>> members();
}
