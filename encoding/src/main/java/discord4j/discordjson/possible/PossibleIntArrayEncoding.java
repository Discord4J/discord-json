package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class PossibleIntArrayEncoding {

    @Encoding.Impl
    private Possible<int[]> field = discord4j.discordjson.possible.Possible.absent();

    @Encoding.Copy
    public Possible<int[]> withPossible(final Possible<int[]> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Copy
    public Possible<int[]> with(final int[] value) {
        return Possible.of(value);
    }

    @Encoding.Builder
    static class Builder {

        private Possible<int[]> possible = discord4j.discordjson.possible.Possible.absent();

        @Encoding.Init
        @Encoding.Copy
        public void set(Possible<int[]> value) {
            this.possible = value;
        }

        @Encoding.Init
        public void setValue(int[] value) {
            this.possible = discord4j.discordjson.possible.Possible.of(value);
        }

        @Encoding.Build
        Possible<int[]> build() {
            return this.possible;
        }
    }
}
