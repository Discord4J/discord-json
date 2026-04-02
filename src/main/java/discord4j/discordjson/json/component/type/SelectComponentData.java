package discord4j.discordjson.json.component.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.json.SelectDefaultValueData;
import discord4j.discordjson.possible.Possible;

import java.util.List;

public interface SelectComponentData extends SelectComponentDataBase {

    @JsonProperty("default_values")
    Possible<List<SelectDefaultValueData>> defaultValues();

}
