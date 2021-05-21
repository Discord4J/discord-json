package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ThreadMemberData;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadMembersUpdate.class)
@JsonDeserialize(as = ImmutableThreadMembersUpdate.class)
public interface ThreadMembersUpdate extends Dispatch {

    static ImmutableThreadMembersUpdate.Builder builder() {
        return ImmutableThreadMembersUpdate.builder();
    }

    Id id();

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("member_count")
    int memberCount();

    @JsonProperty("added_members")
    List<ThreadMemberData> addedMembers();

    @JsonProperty("removed_member_ids")
    List<Id> removedMemberIds();
}
