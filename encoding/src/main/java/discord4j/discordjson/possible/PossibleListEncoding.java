package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;
import reactor.util.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Encoding
public class PossibleListEncoding<T> {

    @Encoding.Impl
    private final List<T> list = null;

    @Encoding.Expose
    public Possible<List<T>> get() {
        return this.list == null ? discord4j.discordjson.possible.Possible.absent() : discord4j.discordjson.possible.Possible.of(this.list);
    }

    @Encoding.Of
    @Nullable
    static <T> List<T> init(Possible<? extends List<T>> possible) {
        return Objects.requireNonNull(possible).toOptional().<List<T>>map(ArrayList::new).orElse(null);
    }

    @Override
    public String toString() {
        return Objects.toString(list);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(list);
    }

    public boolean equals(PossibleListEncoding<T> obj) {
        return Objects.equals(list, obj.list);
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
        void addAll(List<? extends T> elements) {
            getOrCreate().addAll(elements);
        }

        @Encoding.Build
        List<T> build() {
            return this.list;
        }

        @Encoding.Init
        @Encoding.Copy
        void set(Possible<? extends List<? extends T>> elements) {
            this.list = null;

            elements.toOptional().ifPresent(e -> getOrCreate().addAll(e));
        }

        @Encoding.Init
        void setValue(List<? extends T> elements) {
            this.list = new ArrayList<>(elements);
        }

        private List<T> getOrCreate() {
            if (this.list == null) {
                this.list = new ArrayList<>();
            }
            return this.list;
        }
    }
}
