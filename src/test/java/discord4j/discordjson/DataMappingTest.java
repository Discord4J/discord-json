package discord4j.discordjson;

import discord4j.discordjson.json.GuildData;
import discord4j.discordjson.json.GuildFields;
import discord4j.discordjson.json.PartialGuildData;
import discord4j.discordjson.possible.Possible;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataMappingTest {

    @Test
    public void createPartialGuildDataFromGuildData() {
        GuildData guildData = GuildData.builder()
                .id(Id.of("123456"))
                .name("name")
                .verificationLevel(1)
                .ownerId(Id.of("1234"))
                .region("region")
                .afkTimeout(1)
                .defaultMessageNotifications(1)
                .explicitContentFilter(1)
                .mfaLevel(1)
                .addFeature("ONCE")
                .premiumTier(1)
                .joinedAt(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(ZonedDateTime.now()))
                .large(false)
                .memberCount(1)
                .preferredLocale("en-US")
                .build();
        PartialGuildData partialGuildData = PartialGuildData.builder()
                .from((GuildFields) guildData)
                .build();
        assertEquals(Id.of("123456"), partialGuildData.id());
        assertEquals(Possible.absent(), partialGuildData.owner());
        assertEquals(1, partialGuildData.verificationLevel());
        assertEquals(1, partialGuildData.features().size());
    }
}
