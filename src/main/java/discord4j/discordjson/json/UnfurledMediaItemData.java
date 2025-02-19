package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUnfurledMediaItemData.class)
@JsonDeserialize(as = ImmutableUnfurledMediaItemData.class)
public interface UnfurledMediaItemData {

    static ImmutableUnfurledMediaItemData.Builder builder() {
        return ImmutableUnfurledMediaItemData.builder();
    }

    String url();

}
