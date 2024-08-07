package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationEmojiDataList.class)
@JsonDeserialize(as = ImmutableApplicationEmojiDataList.class)
public interface ApplicationEmojiDataList {

    static ImmutableApplicationEmojiDataList.Builder builder() {
        return ImmutableApplicationEmojiDataList.builder();
    }

    List<EmojiData> items();

}
