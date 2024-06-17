package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@JsonDeserialize(as = ImmutableApplicationRoleConnectionMetadataData.class)
@JsonSerialize(as = ImmutableApplicationRoleConnectionMetadataData.class)
public interface ApplicationRoleConnectionMetadataData {

    static ImmutableApplicationRoleConnectionMetadataData.Builder builder() {
        return ImmutableApplicationRoleConnectionMetadataData.builder();
    }

    int type();

    String key();

    String name();

    @JsonProperty("name_localizations")
    Possible<Map<String, String>> nameLocalizations();

    String description();

    @JsonProperty("description_localizations")
    Possible<Map<String, String>> descriptionLocalizations();

}
