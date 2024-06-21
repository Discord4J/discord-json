package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.annotation.Experimental;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationInfoData.class)
@JsonDeserialize(as = ImmutableApplicationInfoData.class)
public interface ApplicationInfoData {

    static ImmutableApplicationInfoData.Builder builder() {
        return ImmutableApplicationInfoData.builder();
    }

    Id id();

    String name();

    Optional<String> icon();

    String description();

    @JsonProperty("rpc_origins")
    Possible<List<String>> rpcOrigins();

    @JsonProperty("bot_public")
    boolean botPublic();

    @JsonProperty("bot_require_code_grant")
    boolean botRequireCodeGrant();

    Possible<PartialUserData> bot();

    @JsonProperty("terms_of_service_url")
    Possible<String> termsOfServiceUrl();

    @JsonProperty("privacy_policy_url")
    Possible<String> privacyPolicyUrl();

    Possible<PartialUserData> owner();

    /**
     * @deprecated This field is deprecated and will be removed in Discord API v11. This field always returns an empty
     * string, you should use {@link #description() description} instead.
     *
     * @return An empty string.
     */
    @Deprecated
    String summary();

    @JsonProperty("verify_key")
    String verifyKey();

    Optional<ApplicationTeamData> team();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    Possible<PartialGuildData> guild();

    @JsonProperty("primary_sku_id")
    Possible<Id> primarySkuId();

    Possible<String> slug();

    @JsonProperty("cover_image")
    Possible<String> coverImage();

    Possible<Integer> flags();

    @JsonProperty("approximate_guild_count")
    Possible<Integer> approximateGuildCount();

    @JsonProperty("redirect_uris")
    Possible<List<String>> redirectUris();

    @JsonProperty("interactions_endpoint_url")
    Possible<String> interactionsEndpointUrl();

    @JsonProperty("role_connections_verification_url")
    Possible<String> roleConnectionsVerificationUrl();

    Possible<List<String>> tags();

    @JsonProperty("install_params")
    Possible<InstallParamsData> installParams();

    /**
     * This is considered an experimental feature by Discord and may be changed in the future.
     *
     * @return A map of integration type IDs to their configuration data.
     */
    @Experimental
    @JsonProperty("integration_types_config")
    Possible<Map<Integer, ApplicationIntegrationTypeConfigurationData>> integrationTypesConfig();

    @JsonProperty("custom_install_url")
    Possible<String> customInstallUrl();
}
