package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

public interface MessageSendRequestBase {

    Possible<String> content();

    Possible<Boolean> tts();

    @JsonProperty("allowed_mentions")
    Possible<AllowedMentionsData> allowedMentions();

    @JsonProperty("message_reference")
    Possible<MessageReferenceData> messageReference();

}
