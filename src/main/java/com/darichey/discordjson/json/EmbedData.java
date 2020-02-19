package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedData.class)
public interface EmbedData {

    Possible<String> title();

    Possible<String> type();

    Possible<String> description();

    Possible<String> url();

    Possible<String> timestamp();

    Possible<Integer> color();

    Possible<EmbedFooterData> footer();

    Possible<EmbedImageData> image();

    Possible<EmbedThumbnailData> thumbnail();

    Possible<EmbedVideoData> video();

    Possible<EmbedProviderData> provider();

    Possible<EmbedAuthorData> author();

    Possible<List<EmbedFiledData>> fields();
}
