package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAuthorizationInfoData.class)
@JsonDeserialize(as = ImmutableAuthorizationInfoData.class)
public interface AuthorizationInfoData {

    static ImmutableAuthorizationInfoData.Builder builder() {
        return ImmutableAuthorizationInfoData.builder();
    }

    PartialApplicationInfoData application();

    List<String> scopes();

    String expires();

    Possible<UserData> user();
}
