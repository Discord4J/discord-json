package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableTemplateCreateGuildRequest.class)
@JsonDeserialize(as = ImmutableTemplateCreateGuildRequest.class)
public interface TemplateCreateGuildRequest {

    static ImmutableTemplateCreateGuildRequest.Builder builder() {
        return ImmutableTemplateCreateGuildRequest.builder();
    }

    String name();
    Possible<String> icon();
}
