package discord4j.discordjson.possible;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

public class PossibleModule extends Module {

    public final static boolean DEFAULT_READ_NULL_AS_ABSENT = false;

    private boolean readNullAsAbsent = DEFAULT_READ_NULL_AS_ABSENT;

    @Override
    public String getModuleName() {
        return "PossibleModule";
    }

    @Override
    public Version version() {
        return new Version(2, 0, 0, null, null, null);
    }

    @Override
    public void setupModule(SetupContext context) {
        context.addSerializers(new PossibleSerializers());
        context.addDeserializers(new PossibleDeserializers(readNullAsAbsent));
        context.addTypeModifier(new PossibleTypeModifier());
    }

    /**
     * Method to configure reading {@code null} values to {@link Possible} fields. If set to {@code true}, values will
     * be deserialized to {@link Possible#absent()}, to be used as an escape hatch and accept {@code null} values into
     * a {@code Possible<T>} field, avoiding a {@link com.fasterxml.jackson.databind.exc.ValueInstantiationException}.
     * In this regard, you would set this method to {@code true} only if you encounter such exceptions due to incorrect
     * field type or a transient issue with the JSON input.
     * <p>
     * It is imperative to consider this can also interfere with methods that have distinct "null" vs "absent" behavior,
     * and that writing a read value with this setting to {@code true} can lead to semantic differences.
     * <p>
     * If set to {@code false}, creates a {@code Possible.of(Optional.empty))} instance when reading a {@code null}
     * value, meaning only a {@code Possible<Optional<T>>} field is the type to properly work with this setting.
     * <p>
     * Defaults to {@link #DEFAULT_READ_NULL_AS_ABSENT}.
     *
     * @param value whether to enable or disable this feature
     * @return this module
     */
    public PossibleModule configureReadNullAsAbsent(boolean value) {
        this.readNullAsAbsent = value;
        return this;
    }
}
