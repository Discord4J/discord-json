package discord4j.discordjson.json;

import org.immutables.value.Value;

@Value.Immutable
public abstract class TokenRevokeRequest {

    public static ImmutableTokenRevokeRequest.Builder builder() {
        return ImmutableTokenRevokeRequest.builder();
    }

    public abstract long clientId();

    public abstract String clientSecret();

    public abstract String token();

    @Override
    public String toString() {
        return "token=" + token();
    }
}
