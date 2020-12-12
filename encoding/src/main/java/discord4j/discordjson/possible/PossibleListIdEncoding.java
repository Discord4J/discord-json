package discord4j.discordjson.possible;

import discord4j.discordjson.Id;
import org.immutables.encode.Encoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Encoding
public class PossibleListIdEncoding {

    @Encoding.Impl(virtual = true)
    private Possible<List<Id>> possible;

    private final List<Id> value = possible.toOptional().orElse(null);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<List<Id>> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() :
                discord4j.discordjson.possible.Possible.of(value);
    }

    @Encoding.Naming("is*Present")
    boolean isPresent() {
        return !absent;
    }

    @Encoding.Naming("*OrElse")
    List<Id> orElse(List<Id> defaultValue) {
        return !absent ? value : defaultValue;
    }

    //    @Encoding.Of
    //    @Nullable
    //    static <T> List<T> init(Possible<List<T>> possible) {
    //        return Objects.requireNonNull(possible).toOptional().<List<T>>map(ArrayList::new).orElse(null);
    //    }

    @Override
    public String toString() {
        return Objects.toString(value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean equals(PossibleListIdEncoding obj) {
        return Objects.equals(value, obj.value);
    }

    @Encoding.Builder
    static class Builder {

        private List<Id> list = null;

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void add(Id element) {
            getOrCreate().add(element);
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void addStringValue(String element) {
            getOrCreate().add(discord4j.discordjson.Id.of(element));
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void addLongValue(long element) {
            getOrCreate().add(discord4j.discordjson.Id.of(element));
        }

//        @Encoding.Naming(standard = Encoding.StandardNaming.ADD_ALL)
//        @Encoding.Init
//        void addAll(List<Id> elements) {
//            getOrCreate().addAll(elements);
//        }
//
//        @Encoding.Naming(standard = Encoding.StandardNaming.ADD_ALL)
//        @Encoding.Init
//        void addAll(List<String> elements) {
//            getOrCreate().addAll(elements.stream().map(discord4j.discordjson.Id::of).collect(Collectors.toList()));
//        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD_ALL)
        @Encoding.Init
        void addAll(List<Long> elements) {
            getOrCreate().addAll(elements.stream().map(discord4j.discordjson.Id::of).collect(Collectors.toList()));
        }

        @Encoding.Build
        Possible<List<Id>> build() {
            return this.list == null ? discord4j.discordjson.possible.Possible.absent() :
                    discord4j.discordjson.possible.Possible.of(this.list);
        }

        @Encoding.Init
        @Encoding.Copy
        void set(Possible<List<Id>> elements) {
            this.list = null;

            elements.toOptional().ifPresent(e -> getOrCreate().addAll(e));
        }

//        @Encoding.Init
//        void setValue(List<Id> elements) {
//            this.list = new ArrayList<>(elements);
//        }

        @Encoding.Init
        void setValue(List<Long> elements) {
            this.list = elements.stream().map(Id::of).collect(Collectors.toList());
        }

        private List<Id> getOrCreate() {
            if (this.list == null) {
                this.list = new ArrayList<>();
            }
            return this.list;
        }
    }
}
