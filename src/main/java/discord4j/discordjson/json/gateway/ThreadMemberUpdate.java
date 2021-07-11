package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ThreadMemberData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadMemberUpdate.class)
@JsonDeserialize(as = ImmutableThreadMemberUpdate.class)
public interface ThreadMemberUpdate extends Dispatch {

    static ImmutableThreadMemberUpdate.Builder builder() {
        return ImmutableThreadMemberUpdate.builder();
    }

    @JsonUnwrapped
    ThreadMemberData member();
}
