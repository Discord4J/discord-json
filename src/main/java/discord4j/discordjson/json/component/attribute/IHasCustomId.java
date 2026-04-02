package discord4j.discordjson.json.component.attribute;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface IHasCustomId {

    @JsonProperty("custom_id")
    String customId();

}
