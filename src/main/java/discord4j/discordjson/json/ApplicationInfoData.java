package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationInfoData.class)
@JsonDeserialize(as = ImmutableApplicationInfoData.class)
public interface ApplicationInfoData {

    String id();
    String name();
    Optional<String> icon();
    String description();
    @JsonProperty("rpc_origins")
    default Possible<List<String>> rpcOrigins() { return Possible.absent(); }
    @JsonProperty("bot_public")
    boolean botPublic();
    @JsonProperty("bot_require_code_grant")
    boolean botRequireCodeGrant();
    UserData owner();
    String summary();
    @JsonProperty("verify_key")
    String verifyKey();
    Optional<ApplicationTeamData> team();
    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
    @JsonProperty("primary_sku_id")
    default Possible<String> primarySkuId() { return Possible.absent(); }
    default Possible<String> slug() { return Possible.absent(); }
    @JsonProperty("cover_image")
    default Possible<String> coverImage() { return Possible.absent(); }
}
