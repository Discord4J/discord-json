package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.json.parser.ComponentParser;
import discord4j.discordjson.possible.Possible;

@JsonDeserialize(using = ComponentParser.class)
public interface ComponentData {

    int type();

    Possible<Integer> id();

}
