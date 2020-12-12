package discord4j.discordjson;

import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class IdEncoding {

    @Encoding.Impl(virtual = true)
    private Id id;

    private final long value = id.longValue();

    @Encoding.Expose
    Id get() {
        return discord4j.discordjson.Id.of(value);
    }

    @Override
    public String toString() {
        return Objects.toString(value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean equals(IdEncoding obj) {
        return Objects.equals(value, obj.value);
    }

    @Encoding.Copy
    public Id withLong(final long value) {
        return discord4j.discordjson.Id.of(value);
    }

    @Encoding.Copy
    public Id withString(final String value) {
        return discord4j.discordjson.Id.of(value);
    }

    @Encoding.Builder
    static class Builder {

        private Id id = null;

        @Encoding.Init
        public void setStringValue(String value) {
            this.id = discord4j.discordjson.Id.of(value);
        }

        @Encoding.Init
        public void setLongValue(long value) {
            this.id = discord4j.discordjson.Id.of(value);
        }

        @Encoding.Copy
        public void copyId(Id value) {
            this.id = value;
        }

        @Encoding.Build
        Id build() {
            return this.id;
        }
    }
}
