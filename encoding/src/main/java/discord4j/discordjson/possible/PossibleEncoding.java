package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;

@Encoding
public class PossibleEncoding<T> {
    @Encoding.Impl
    private Possible<T> field;

    @Encoding.Builder
    static class Builder<T> {

        private Possible<T> buildValue = discord4j.discordjson.possible.Possible.absent();

        @Encoding.Init
        @Encoding.Copy
        public void set(Possible<T> value) {
            this.buildValue = value;
        }

        @Encoding.Init
        public void setValue(T value) {
            this.buildValue = discord4j.discordjson.possible.Possible.of(value);
        }

        @Encoding.Build
        Possible<T> build() {
            return buildValue;
        }
    }
}
