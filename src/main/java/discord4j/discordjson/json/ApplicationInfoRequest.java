package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationInfoRequest.class)
@JsonDeserialize(as = ImmutableApplicationInfoRequest.class)
public interface ApplicationInfoRequest {

    static ImmutableApplicationInfoRequest.Builder builder() {
        return ImmutableApplicationInfoRequest.builder();
    }

    @JsonProperty("custom_install_url")
    Possible<String> customInstallUrl();

    @JsonProperty("description")
    Possible<String> description();

    @JsonProperty("role_connections_verification_url")
    Possible<String> roleConnectionsVerificationUrl();

    @JsonProperty("install_params")
    Possible<InstallParamsData> installParams();

    Possible<Integer> flags();

    Possible<Optional<String>> icon();

    @JsonProperty("cover_image")
    Possible<Optional<String>> coverImage();

    @JsonProperty("interactions_endpoint_url")
    Possible<String> interactionsEndpointUrl();

    Possible<List<String>> tags();

}
