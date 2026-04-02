package discord4j.discordjson.json.component.attribute;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

public interface ICanHaveRangedValueCount {

    @JsonProperty("min_values")
    Possible<Integer> minValues();

    @JsonProperty("max_values")
    Possible<Integer> maxValues();

}
