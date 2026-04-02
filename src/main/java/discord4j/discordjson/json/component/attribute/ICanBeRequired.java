package discord4j.discordjson.json.component.attribute;

import discord4j.discordjson.possible.Possible;

public interface ICanBeRequired {

    Possible<Boolean> required();

}
