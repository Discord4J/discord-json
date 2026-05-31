package discord4j.discordjson.json.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.type.SelectComponentData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelSelectComponentData.class)
@JsonDeserialize(as = ImmutableChannelSelectComponentData.class)
public interface ChannelSelectComponentData extends SelectComponentData {

    int COMPONENT_TYPE_ID = 8;

    static ImmutableChannelSelectComponentData.Builder builder() {
        return ImmutableChannelSelectComponentData.builder().type(ChannelSelectComponentData.COMPONENT_TYPE_ID);
    }

    @JsonProperty("channel_types")
    Possible<List<Integer>> channelTypes();

}
