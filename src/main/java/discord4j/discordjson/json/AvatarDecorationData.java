package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAvatarDecorationData.class)
@JsonDeserialize(as = ImmutableAvatarDecorationData.class)
public interface AvatarDecorationData {

    static ImmutableAvatarDecorationData.Builder builder() {
        return ImmutableAvatarDecorationData.builder();
    }

    String asset();

    @JsonProperty("sku_id")
    Id skuId();

}
