package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableListThreadsData.class)
@JsonDeserialize(as = ImmutableListThreadsData.class)
public interface ListThreadsData {

    static ImmutableListThreadsData.Builder builder() {
        return ImmutableListThreadsData.builder();
    }

    List<ChannelData> threads();

    List<ThreadMemberData> members();

    @JsonProperty("has_more")
    boolean hasMore();
}
