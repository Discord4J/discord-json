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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePollCreateData.class)
@JsonDeserialize(as = ImmutablePollCreateData.class)
public interface PollCreateData {

    static ImmutablePollCreateData.Builder builder() {
        return ImmutablePollCreateData.builder();
    }

    Possible<PollMediaObject> question();

    Possible<List<PollAnswerObject>> answers();

    Possible<Integer> duration();

    @JsonProperty("allow_multiselect")
    Possible<Boolean> allowMultiselect();

    @JsonProperty("layout_type")
    Possible<Integer> layoutType();

}
