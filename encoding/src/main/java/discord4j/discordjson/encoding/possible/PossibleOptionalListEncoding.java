package discord4j.discordjson.encoding.possible;

import discord4j.discordjson.possible.Possible;
import org.immutables.encode.Encoding;
import javax.annotation.Nullable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Encoding
public class PossibleOptionalListEncoding<T> {

    @Encoding.Impl(virtual = true)
    private Possible<Optional<List<T>>> possible = discord4j.discordjson.possible.Possible.absent();

    private final List<T> value = discord4j.discordjson.possible.Possible.flatOpt(possible).orElse(null);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<Optional<List<T>>> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() :
                discord4j.discordjson.possible.Possible.of(Optional.ofNullable(value));
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
    public Possible<Optional<List<T>>> withPossible(Possible<? extends Optional<? extends List<? extends T>>> possible) {
        return (discord4j.discordjson.possible.Possible<Optional<List<T>>>) Objects.requireNonNull(possible);
    }

    @Encoding.Copy
    @Deprecated
    public Possible<Optional<List<T>>> withIterable(@Nullable Iterable<T> elements) {
        return discord4j.discordjson.possible.Possible.of(Optional.ofNullable(elements)
                .map(els -> StreamSupport.stream(els.spliterator(), false).collect(Collectors.toList())));
    }

    @Encoding.Naming("with*OrNull")
    @Encoding.Copy
    public Possible<Optional<List<T>>> withIterableOrNull(@Nullable Iterable<? extends T> elements) {
        return discord4j.discordjson.possible.Possible.of(Optional.ofNullable(elements)
                .map(els -> StreamSupport.stream(els.spliterator(), false).collect(Collectors.toList())));
    }

    @Encoding.Copy
    @SafeVarargs
    public final Possible<Optional<List<T>>> withVarargs(T... elements) {
        return discord4j.discordjson.possible.Possible.of(Optional.of(Arrays.asList(elements)));
    }

    @Override
    public String toString() {
        return Objects.toString(value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean equals(PossibleOptionalListEncoding<T> obj) {
        return Objects.equals(value, obj.value);
    }

    @Encoding.Builder
    static class Builder<T> {

        private List<T> list = null;
        private boolean explicitNull;

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD)
        @Encoding.Init
        void add(T element) {
            getOrCreate().add(element);
            this.explicitNull = false;
        }

        @Encoding.Naming(standard = Encoding.StandardNaming.ADD_ALL)
        @Encoding.Init
        void addAll(Collection<? extends T> elements) {
            getOrCreate().addAll(elements);
            this.explicitNull = false;
        }

        @Encoding.Build
        Possible<Optional<List<T>>> build() {
            return this.list == null && !explicitNull ? discord4j.discordjson.possible.Possible.absent() :
                    discord4j.discordjson.possible.Possible.of(Optional.ofNullable(this.list));
        }

        @Encoding.Init
        @Encoding.Copy
        void set(Possible<? extends Optional<? extends Collection<? extends T>>> elements) {
            this.list = null;
            this.explicitNull = false;

            elements.toOptional().ifPresent(e -> {
                if (e.isPresent()) {
                    getOrCreate().addAll(e.get());
                } else {
                    this.explicitNull = true;
                }
            });
        }

        @Encoding.Init
        @Deprecated
        void setValueIterable(@Nullable Iterable<T> elements) {
            if (elements == null) {
                this.list = null;
                this.explicitNull = true;
            } else {
                this.list = StreamSupport.stream(elements.spliterator(), false).collect(Collectors.toList());
                this.explicitNull = false;
            }
        }

        @Encoding.Naming("*OrNull")
        @Encoding.Init
        void setValueIterableOrNull(@Nullable Iterable<? extends T> elements) {
            if (elements == null) {
                this.list = null;
                this.explicitNull = true;
            } else {
                this.list = StreamSupport.stream(elements.spliterator(), false).collect(Collectors.toList());
                this.explicitNull = false;
            }
        }

        @SafeVarargs
        @Encoding.Naming("*OrNull")
        @Encoding.Init
        final void setValueVarargsOrNull(@Nullable T... elements) {
            if (elements == null) {
                this.list = null;
                this.explicitNull = true;
            } else {
                this.list = Arrays.asList(elements);
                this.explicitNull = false;
            }
        }

        private List<T> getOrCreate() {
            if (this.list == null) {
                this.list = new ArrayList<>();
            }
            return this.list;
        }
    }
}
