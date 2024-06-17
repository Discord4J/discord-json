package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationInstallParamsData.class)
@JsonDeserialize(as = ImmutableApplicationInstallParamsData.class)
public interface ApplicationInstallParamsData {

    static ImmutableApplicationInstallParamsData.Builder builder() {
        return ImmutableApplicationInstallParamsData.builder();
    }

    List<String> scopes();

    String permissions();

}
