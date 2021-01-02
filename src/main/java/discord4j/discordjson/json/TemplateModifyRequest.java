package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableTemplateModifyRequest.class)
@JsonDeserialize(as = ImmutableTemplateModifyRequest.class)
public interface TemplateModifyRequest {

    static ImmutableTemplateModifyRequest.Builder builder() {
        return ImmutableTemplateModifyRequest.builder();
    }

    Possible<String> name();
    Possible<Optional<String>> description();
}
