package discord4j.discordjson.json.component.attribute;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

public interface ICanBeDefault {

    @JsonProperty("default")
    Possible<Boolean> isDefault();

}
