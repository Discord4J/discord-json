package discord4j.discordjson.encoding.possible;

import discord4j.discordjson.possible.Possible;
import org.immutables.encode.Encoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Encoding
public class PossibleListEncoding<T> {

    @Encoding.Impl(virtual = true)
    private Possible<List<T>> possible = discord4j.discordjson.possible.Possible.absent();

    private final List<T> value = possible.toOptional().orElse(null);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<List<T>> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() :
                discord4j.discordjson.possible.Possible.of(value);
    }

    @Encoding.Naming("is*Present")
    boolean isPresent() {
        return !absent;
    }

    @Encoding.Naming("*OrElse")
    List<T> orElse(List<T> defaultValue) {
        return !absent ? value : defaultValue;
    }

    @Encoding.Copy
    public Possible<List<T>> withPossible(Possible<? extends List<? extends T>> possible) {
        return (discord4j.discordjson.possible.Possible<List<T>>) Objects.requireNonNull(possible);
    }

    @Encoding.Copy
    public Possible<List<T>> withIterable(Iterable<? extends T> elements) {
        return discord4j.discordjson.possible.Possible.of(
                StreamSupport.stream(Objects.requireNonNull(elements).spliterator(), false).collect(Collectors.toList()));
    }

    @Encoding.Copy
    @SafeVarargs
    public final Possible<List<T>> withVarargs(T... elements) {
        return discord4j.discordjson.possible.Possible.of(Arrays.asList(elements));
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

    public boolean equals(PossibleListEncoding<T> obj) {
        return Objects.equals(value, obj.value);
    }

    @Encoding.Builder
    static class Builder<T> {

        private List<T> list = null;

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void add(T element) {
            getOrCreate().add(element);
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD_ALL)
        @Encoding.Init
        void addAll(Collection<? extends T> elements) {
            getOrCreate().addAll(elements);
        }

        @Encoding.Build
        Possible<List<T>> build() {
            return this.list == null ? discord4j.discordjson.possible.Possible.absent() :
                    discord4j.discordjson.possible.Possible.of(this.list);
        }

        @Encoding.Init
        @Encoding.Copy
        void set(Possible<? extends Collection<? extends T>> elements) {
            this.list = null;

            elements.toOptional().ifPresent(e -> getOrCreate().addAll(e));
        }

        @Encoding.Init
        void setValueIterable(Iterable<? extends T> elements) {
            this.list = StreamSupport.stream(elements.spliterator(), false).collect(Collectors.toList());
        }

        @SafeVarargs
        @Encoding.Init
        final void setValueVarargs(T... elements) {
            this.list = Arrays.asList(elements);
        }

        private List<T> getOrCreate() {
            if (this.list == null) {
                this.list = new ArrayList<>();
            }
            return this.list;
        }
    }
}
