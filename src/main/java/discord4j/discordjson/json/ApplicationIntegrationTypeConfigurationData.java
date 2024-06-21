package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationIntegrationTypeConfigurationData.class)
@JsonDeserialize(as = ImmutableApplicationIntegrationTypeConfigurationData.class)
public interface ApplicationIntegrationTypeConfigurationData {

    static ImmutableApplicationIntegrationTypeConfigurationData.Builder builder() {
        return ImmutableApplicationIntegrationTypeConfigurationData.builder();
    }

    @JsonProperty("oauth2_install_params")
    Possible<InstallParamsData> oauth2InstallParams();

}
