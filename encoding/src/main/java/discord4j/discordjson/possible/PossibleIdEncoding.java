package discord4j.discordjson.possible;

import discord4j.discordjson.Id;
import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class PossibleIdEncoding {

    @Encoding.Impl(virtual = true)
    private Possible<Id> possible;

    private final long value = possible.toOptional()
            .map(Id::longValue)
            .orElse(0L);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<Id> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() :
                discord4j.discordjson.possible.Possible.of(discord4j.discordjson.Id.of(value));
    }

    @Encoding.Naming("is*Present")
    boolean isPresent() {
        return !absent;
    }

    @Encoding.Naming("*OrElse")
    long orElse(long defaultValue) {
        return !absent ? value : defaultValue;
    }

    @Encoding.Copy
    public Possible<Id> withPossible(final Possible<Id> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Copy
    public Possible<Id> with(final long value) {
        return discord4j.discordjson.possible.Possible.of(discord4j.discordjson.Id.of(value));
    }

    @Encoding.Builder
    static class Builder {

        private Possible<Id> possible = discord4j.discordjson.possible.Possible.absent();

        @Encoding.Init
        @Encoding.Copy
        public void set(Possible<Id> value) {
            this.possible = value;
        }

        @Encoding.Init
        public void setIdValue(Id value) {
            this.possible = discord4j.discordjson.possible.Possible.of(value);
        }

        @Encoding.Init
        public void setValue(long value) {
            this.possible = discord4j.discordjson.possible.Possible.of(discord4j.discordjson.Id.of(value));
        }

        @Encoding.Build
        Possible<Id> build() {
            return this.possible;
        }
    }
}
