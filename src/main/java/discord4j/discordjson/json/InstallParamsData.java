package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableInstallParamsData.class)
@JsonDeserialize(as = ImmutableInstallParamsData.class)
public interface InstallParamsData {

    static ImmutableInstallParamsData.Builder builder() {
        return ImmutableInstallParamsData.builder();
    }

    List<String> scopes();

    String permissions();
}
