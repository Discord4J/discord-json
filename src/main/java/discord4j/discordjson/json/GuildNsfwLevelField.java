package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface GuildNsfwLevelField {

    @JsonProperty("nsfw_level")
    int nsfwLevel();
}
