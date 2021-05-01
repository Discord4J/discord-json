package discord4j.discordjson.json;

import org.immutables.value.Value;

import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Value.Immutable
public abstract class ClientCredentialsGrantRequest {

    public static ImmutableClientCredentialsGrantRequest.Builder builder() {
        return ImmutableClientCredentialsGrantRequest.builder();
    }

    public abstract long clientId();

    public abstract String clientSecret();

    public abstract String scope();

    @Override
    public String toString() {
        String scope;
        try {
            scope = URLEncoder.encode(scope(), StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new UncheckedIOException(e);
        }
        return "grant_type=client_credentials" +
                "&scope=" + scope;
    }
}
