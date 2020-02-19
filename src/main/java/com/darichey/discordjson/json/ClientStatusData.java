package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableClientStatusData.class)
public interface ClientStatusData {

    default Possible<String> desktop() { return Possible.absent(); }

    default Possible<String> mobile() { return Possible.absent(); }

    default Possible<String> web() { return Possible.absent(); }
}
