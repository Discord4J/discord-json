package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAccessTokenData.class)
@JsonDeserialize(as = ImmutableAccessTokenData.class)
public interface AccessTokenData {

    static ImmutableAccessTokenData.Builder builder() {
        return ImmutableAccessTokenData.builder();
    }

    @JsonProperty("access_token")
    String accessToken();

    @JsonProperty("token_type")
    String tokenType();

    @JsonProperty("expires_in")
    long expiresIn();

    Possible<GuildUpdateData> guild();

    @JsonProperty("refresh_token")
    Possible<String> refreshToken();

    String scope();

    Possible<WebhookData> webhook();
}
