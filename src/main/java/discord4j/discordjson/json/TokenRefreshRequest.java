package discord4j.discordjson.json;

import org.immutables.value.Value;

@Value.Immutable
public abstract class TokenRefreshRequest {

    public static ImmutableTokenRefreshRequest.Builder builder() {
        return ImmutableTokenRefreshRequest.builder();
    }

    public abstract long clientId();

    public abstract String clientSecret();

    public abstract String refreshToken();

    @Override
    public String toString() {
        return "client_id=" + clientId() +
                "&client_secret=" + clientSecret() +
                "&grant_type=refresh_token" +
                "&refresh_token=" + refreshToken();
    }
}
