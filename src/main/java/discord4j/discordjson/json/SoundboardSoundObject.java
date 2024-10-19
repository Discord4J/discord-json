/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J. If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableSoundboardSoundObject.class)
@JsonDeserialize(as = ImmutableSoundboardSoundObject.class)
public interface SoundboardSoundObject {

    static ImmutableSoundboardSoundObject.Builder builder() {
        return ImmutableSoundboardSoundObject.builder();
    }

    String name();

    @JsonProperty("sound_id")
    Id soundId();

    double volume();

    @JsonProperty("emoji_id")
    Optional<Id> emojiId();

    @JsonProperty("emoji_name")
    Optional<String> emojiName();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    boolean available();

    Possible<PartialUserData> user();

}
