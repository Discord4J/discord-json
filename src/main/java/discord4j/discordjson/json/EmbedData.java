package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedData.class)
@JsonDeserialize(as = ImmutableEmbedData.class)
public interface EmbedData {

    static ImmutableEmbedData.Builder builder() {
        return ImmutableEmbedData.builder();
    }

    Possible<? extends String> title();

    Possible<? extends String> type();

    Possible<? extends String> description();

    Possible<? extends String> url();

    Possible<? extends String> timestamp();

    Possible<? extends Integer> color();

    Possible<? extends EmbedFooterData> footer();

    Possible<? extends EmbedImageData> image();

    Possible<? extends EmbedThumbnailData> thumbnail();

    Possible<? extends EmbedVideoData> video();

    Possible<? extends EmbedProviderData> provider();

    Possible<? extends EmbedAuthorData> author();

    Possible<List<EmbedFieldData>> fields();
}
