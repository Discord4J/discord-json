package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;

interface GuildVerificationLevelField {

    @JsonProperty("verification_level")
    int verificationLevel();
}
