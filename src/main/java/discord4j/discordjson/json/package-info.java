/**
 * Data objects for JSON representation across Discord.
 */
@Value.Style(
        jdkOnly = true,
        allParameters = true,
        defaults = @Value.Immutable(
                copy = false
        ),
        defaultAsDefault = true
)
@NonNullApi
@PossibleEncodingEnabled
package discord4j.discordjson.json;

import discord4j.discordjson.possible.PossibleEncodingEnabled;
import org.immutables.value.Value;
import reactor.util.annotation.NonNullApi;