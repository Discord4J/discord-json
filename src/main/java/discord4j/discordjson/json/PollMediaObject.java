package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePollMediaObject.class)
@JsonDeserialize(as = ImmutablePollMediaObject.class)
public interface PollMediaObject {

    static ImmutablePollMediaObject.Builder builder() {
        return ImmutablePollMediaObject.builder();
    }

    Possible<String> text();

    Possible<EmojiData> emoji();

}
