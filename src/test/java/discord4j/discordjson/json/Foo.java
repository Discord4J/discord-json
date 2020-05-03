package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableFoo.class)
public interface Foo {

    Possible<String> possible();

    Possible<Optional<String>> optional();

    Possible<List<String>> list();
}
