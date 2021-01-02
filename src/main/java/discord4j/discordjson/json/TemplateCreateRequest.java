package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableTemplateCreateRequest.class)
@JsonDeserialize(as = ImmutableTemplateCreateRequest.class)
public interface TemplateCreateRequest {

    static ImmutableTemplateCreateRequest.Builder builder() {
        return ImmutableTemplateCreateRequest.builder();
    }

    String name();
    Possible<Optional<String>> description();
}
