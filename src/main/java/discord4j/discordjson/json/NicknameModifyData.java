package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableNicknameModifyData.class)
@JsonDeserialize(as = ImmutableNicknameModifyData.class)
public interface NicknameModifyData {

    static ImmutableNicknameModifyData.Builder builder() {
        return ImmutableNicknameModifyData.builder();
    }

    Optional<String> nick();
}
