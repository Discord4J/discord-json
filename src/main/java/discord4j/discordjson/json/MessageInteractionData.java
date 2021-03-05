package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageInteractionData.class)
@JsonDeserialize(as = ImmutableMessageInteractionData.class)
public interface MessageInteractionData {

    static ImmutableMessageInteractionData.Builder builder() {
        return ImmutableMessageInteractionData.builder();
    }

    String id();

    int type();

    String name();

    UserData user();

}
