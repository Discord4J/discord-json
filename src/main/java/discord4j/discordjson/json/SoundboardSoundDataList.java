package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSoundboardSoundDataLista.class)
@JsonDeserialize(as = ImmutableSoundboardSoundDataList.class)
public interface SoundboardSoundDataList {

    static ImmutableSoundboardSoundDataList.Builder builder() {
        return ImmutableSoundboardSoundDataList.builder();
    }

    List<SoundboardSoundData> items();

}
