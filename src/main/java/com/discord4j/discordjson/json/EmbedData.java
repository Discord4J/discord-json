package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedData.class)
public interface EmbedData {

    default Possible<String> title() { return Possible.absent(); }

    default Possible<String> type() { return Possible.absent(); }

    default Possible<String> description() { return Possible.absent(); }

    default Possible<String> url() { return Possible.absent(); }

    default Possible<String> timestamp() { return Possible.absent(); }

    default Possible<Integer> color() { return Possible.absent(); }

    default Possible<EmbedFooterData> footer() { return Possible.absent(); }

    default Possible<EmbedImageData> image() { return Possible.absent(); }

    default Possible<EmbedThumbnailData> thumbnail() { return Possible.absent(); }

    default Possible<EmbedVideoData> video() { return Possible.absent(); }

    default Possible<EmbedProviderData> provider() { return Possible.absent(); }

    default Possible<EmbedAuthorData> author() { return Possible.absent(); }

    default Possible<List<EmbedFiledData>> fields() { return Possible.absent(); }
}
