package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.type.SelectComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMentionableSelectComponentData.class)
@JsonDeserialize(as = ImmutableMentionableSelectComponentData.class)
public interface MentionableSelectComponentData extends SelectComponentData {

    int COMPONENT_TYPE_ID = 7;

    static ImmutableMentionableSelectComponentData.Builder builder() {
        return ImmutableMentionableSelectComponentData.builder().type(MentionableSelectComponentData.COMPONENT_TYPE_ID);
    }

}
