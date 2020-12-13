package discord4j.discordjson;

import org.immutables.encode.Encoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

@Encoding
public class ListIdEncoding {

    @Encoding.Impl(virtual = true)
    private List<Id> field;

    private final long[] value = field.stream()
            .mapToLong(discord4j.discordjson.Id::longValue)
            .toArray();

    @Encoding.Expose
    List<Id> get() {
        return LongStream.of(value)
                .mapToObj(discord4j.discordjson.Id::of)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return Objects.toString(value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean equals(ListIdEncoding obj) {
        return Objects.equals(value, obj.value);
    }

    @Encoding.Builder
    static class Builder {

        private List<Long> list = null;

        private List<Long> getOrCreate() {
            if (this.list == null) {
                this.list = new ArrayList<>();
            }
            return this.list;
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void addLongValue(final long element) {
            getOrCreate().add(element);
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void addStringValue(final String element) {
            getOrCreate().add(discord4j.discordjson.Id.of(element).longValue());
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void addIdValue(final Id element) {
            getOrCreate().add(element.longValue());
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD_ALL)
        @Encoding.Init
        void addAllLongValues(List<Long> elements) {
            getOrCreate().addAll(elements);
        }

        @Encoding.Init
        @Encoding.Copy
        void setValueList(final List<Id> elements) {
            this.list = elements.stream().map(discord4j.discordjson.Id::longValue).collect(Collectors.toList());
        }

        @Encoding.Init
        void setValueIterable(final Iterable<Id> elements) {
            this.list = StreamSupport.stream(elements.spliterator(), false)
                    .map(discord4j.discordjson.Id::longValue)
                    .collect(Collectors.toList());
        }

        @Encoding.Build
        List<Id> build() {
            return getOrCreate().stream().map(discord4j.discordjson.Id::of).collect(Collectors.toList());
        }
    }
}
