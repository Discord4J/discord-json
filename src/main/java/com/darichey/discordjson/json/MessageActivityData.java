package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageActivityData.class)
public interface MessageActivityData {

    int type();

    @JsonProperty("party_id")
    default Possible<String> partyId() { return Possible.absent(); }
}
