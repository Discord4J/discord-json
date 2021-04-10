package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
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

    @JsonProperty("terms_of_service_url")
    Possible<String> termsOfServiceUrl();

    @JsonProperty("privacy_policy_url")
    Possible<String> privacyPolicyUrl();

    UserData owner();

    String summary();

    @JsonProperty("verify_key")
    String verifyKey();

    Optional<ApplicationTeamData> team();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    @JsonProperty("primary_sku_id")
    Possible<Id> primarySkuId();

    Possible<String> slug();

    @JsonProperty("cover_image")
    Possible<String> coverImage();

    Possible<Integer> flags();
}
