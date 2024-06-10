package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable(builder = false)
@JsonSerialize(as = ImmutablePollVoters.class)
@JsonDeserialize(as = ImmutablePollVoters.class)
public interface PollVoters {

    List<UserData> users();

}
