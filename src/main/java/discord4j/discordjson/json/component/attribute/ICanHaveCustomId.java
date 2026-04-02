package discord4j.discordjson.json.component.attribute;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

public interface ICanHaveCustomId {

    @JsonProperty("custom_id")
    Possible<String> customId();

}
