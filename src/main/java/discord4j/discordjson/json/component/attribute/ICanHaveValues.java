package discord4j.discordjson.json.component.attribute;

import discord4j.discordjson.possible.Possible;

import java.util.List;

public interface ICanHaveValues {

    Possible<List<String>> values();

}
