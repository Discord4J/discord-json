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
package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ActivityUpdateRequest;
import discord4j.discordjson.possible.Possible;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GatewaySerializationTest {

    private static final Logger log = LoggerFactory.getLogger(GatewaySerializationTest.class);

    private ObjectMapper mapper;

    @BeforeEach
    public void init() {
        mapper = Jackson.defaultMapper();
    }

    @Test
    public void testHeartbeat() throws IOException {
        String expected = readResourceAsString("/gateway/outbound/Heartbeat.json");

        GatewayPayload<Heartbeat> payload = GatewayPayload.heartbeat(ImmutableHeartbeat.of(251));
        String result = mapper.writeValueAsString(payload);

        assertEquals(mapper.readTree(expected), mapper.readTree(result));
    }

    @Test
    public void testIdentify() throws IOException {
        String expected = readResourceAsString("/gateway/outbound/Identify.json");

        Identify identify = ImmutableIdentify.of("my_token",
                ImmutableIdentifyProperties.of("linux", "disco", "disco"),
                Possible.of(true), 250, Possible.absent(), Possible.absent(), Possible.absent());
        GatewayPayload<Identify> payload = GatewayPayload.identify(identify);
        String result = mapper.writeValueAsString(payload);

        assertEquals(mapper.readTree(expected), mapper.readTree(result));
    }

    @Test
    public void testStatusUpdate() throws IOException {
        String expected = readResourceAsString("/gateway/outbound/StatusUpdate.json");
        GatewayPayload<StatusUpdate> payload = GatewayPayload.statusUpdate(ImmutableStatusUpdate.builder()
                .since(1583108253548L)
                .status("idle")
                .afk(true)
                .activities(Collections.singletonList(ActivityUpdateRequest.builder()
                        .name("Testing")
                        .type(0)
                        .build()))
                .build());
        String result = mapper.writeValueAsString(payload);
        assertEquals(mapper.readTree(expected), mapper.readTree(result));
    }

    @Test
    public void testVoiceStateUpdate() throws IOException {
        String expected = readResourceAsString("/gateway/outbound/VoiceStateUpdate.json");

        VoiceStateUpdate voiceStateUpdate = ImmutableVoiceStateUpdate.of(
                Id.of("41771983423143937"),
                Optional.of(Id.of("127121515262115840")),
                false, false);
        GatewayPayload<VoiceStateUpdate> payload = GatewayPayload.voiceStateUpdate(voiceStateUpdate);
        String result = mapper.writeValueAsString(payload);

        assertEquals(mapper.readTree(expected), mapper.readTree(result));
    }

    @Test
    public void testVoiceServerPing() throws IOException {
        // TODO
    }

    @Test
    public void testResume() throws IOException {
        String expected = readResourceAsString("/gateway/outbound/Resume.json");

        Resume resume = ImmutableResume.of("randomstring", "evenmorerandomstring", 1337);
        GatewayPayload<Resume> payload = GatewayPayload.resume(resume);
        String result = mapper.writeValueAsString(payload);

        assertEquals(mapper.readTree(expected), mapper.readTree(result));
    }

    @Test
    public void testRequestGuildMembers() throws IOException {
        String expected = readResourceAsString("/gateway/outbound/RequestGuildMembers.json");

        RequestGuildMembers requestGuildMembers = ImmutableRequestGuildMembers.of("41771983444115456",
                Possible.of(""), 0, Possible.absent(), Possible.absent(), Possible.absent());
        GatewayPayload<RequestGuildMembers> payload = GatewayPayload.requestGuildMembers(requestGuildMembers);
        String result = mapper.writeValueAsString(payload);

        assertEquals(mapper.readTree(expected), mapper.readTree(result));
    }

    String readResourceAsString(String name) throws IOException {
        try (InputStream inputStream = getClass().getResourceAsStream(name)) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int nRead;
            byte[] data = new byte[1024];
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }

            buffer.flush();
            byte[] byteArray = buffer.toByteArray();

            return new String(byteArray, StandardCharsets.UTF_8);
        }
    }
}
