package discord4j.discordjson.json;

import org.immutables.value.Value;

import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Value.Immutable
public abstract class AuthorizationCodeGrantRequest {

    public static ImmutableAuthorizationCodeGrantRequest.Builder builder() {
        return ImmutableAuthorizationCodeGrantRequest.builder();
    }

    public abstract long clientId();

    public abstract String clientSecret();

    public abstract String code();

    public abstract String redirectUri();

    @Override
    public String toString() {
        String redirectUri;
        try {
            redirectUri = URLEncoder.encode(redirectUri(), StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new UncheckedIOException(e);
        }
        return "client_id=" + clientId() +
                "&client_secret=" + clientSecret() +
                "&grant_type=authorization_code" +
                "&code=" + code() +
                "&redirect_uri=" + redirectUri;
    }
}
