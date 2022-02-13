package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandInteractionResolvedData.class)
@JsonDeserialize(as = ImmutableApplicationCommandInteractionResolvedData.class)
public interface ApplicationCommandInteractionResolvedData {

    static ImmutableApplicationCommandInteractionResolvedData.Builder builder() {
        return ImmutableApplicationCommandInteractionResolvedData.builder();
    }

    Possible<Map<String, UserData>> users();

    Possible<Map<String, ResolvedMemberData>> members();

    Possible<Map<String, ResolvedChannelData>> channels();

    Possible<Map<String, RoleData>> roles();

    Possible<Map<String, MessageData>> messages();

    Possible<Map<String, AttachmentData>> attachments();

}
