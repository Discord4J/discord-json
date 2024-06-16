package discord4j.discordjson.encoding;

import discord4j.discordjson.Id;
import org.immutables.encode.Encoding;

import java.util.Objects;
import java.util.Optional;

@Encoding
public class OptionalIdEncoding {

    @Encoding.Impl(virtual = true)
    private Optional<Id> optional = Optional.empty();

    private final long value = optional
            .map(discord4j.discordjson.Id::asLong)
            .orElse(0L);
    private final boolean present = optional.isPresent();

    @Encoding.Expose
    Optional<Id> get() {
        return present ? Optional.of(discord4j.discordjson.Id.of(value)) : Optional.empty();
    }

    @Encoding.Naming("is*Present")
    boolean isPresent() {
        return present;
    }

    @Encoding.Naming("*OrElse")
    long orElse(long defaultValue) {
        return present ? value : defaultValue;
    }

    @Encoding.Copy
    public Optional<Id> withOptional(final Optional<Id> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Copy
    public Optional<Id> with(final long value) {
        return Optional.of(discord4j.discordjson.Id.of(value));
    }

    @Encoding.Builder
    static class Builder {

        private Optional<Id> optional = Optional.empty();

        @Encoding.Init
        public void setStringValue(String value) {
            this.optional = Optional.of(discord4j.discordjson.Id.of(value));
        }

        @Encoding.Init
        public void setLongValue(long value) {
            this.optional = Optional.of(discord4j.discordjson.Id.of(value));
        }

        @Encoding.Init
        @Encoding.Copy
        public void copyOptionalId(Optional<Id> value) {
            this.optional = value;
        }

        @Encoding.Build
        Optional<Id> build() {
            return this.optional;
        }
    }
}
