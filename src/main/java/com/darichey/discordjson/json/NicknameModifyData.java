package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableNicknameModifyData.class)
public interface NicknameModifyData {

    String nick();
}
