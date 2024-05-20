/**
 * Data objects for JSON representation across Discord.
 */
@Value.Style(
        depluralize = true,
        jdkOnly = true,
        allParameters = true,
        defaultAsDefault = true,
        allowedClasspathAnnotations = Nullable.class
)
@Nonnull
@MetaEncodingEnabled
package discord4j.discordjson.json.gateway;

import discord4j.discordjson.encoding.MetaEncodingEnabled;
import org.immutables.value.Value;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
