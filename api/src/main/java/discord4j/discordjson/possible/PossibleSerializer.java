package discord4j.discordjson.possible;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import reactor.util.annotation.Nullable;

public class PossibleSerializer extends ReferenceTypeSerializer<Possible<?>> {

    public PossibleSerializer(ReferenceType fullType, boolean staticTyping, TypeSerializer vts, JsonSerializer<Object> ser) {
        super(fullType, staticTyping, vts, ser);
    }

    public PossibleSerializer(ReferenceTypeSerializer<?> base, BeanProperty property, TypeSerializer vts, JsonSerializer<?> valueSer, NameTransformer unwrapper, Object suppressableValue, boolean suppressNulls) {
        super(base, property, vts, valueSer, unwrapper, suppressableValue, suppressNulls);
    }

    @Override
    protected PossibleSerializer withResolved(BeanProperty prop, TypeSerializer vts, JsonSerializer<?> valueSer, NameTransformer unwrapper) {
        return new PossibleSerializer(this, prop, vts, valueSer, unwrapper, _suppressableValue, _suppressNulls);
    }

    @Override
    public PossibleSerializer withContentInclusion(Object suppressableValue, boolean suppressNulls) {
        return new PossibleSerializer(this, _property, _valueTypeSerializer, _valueSerializer, _unwrapper, suppressableValue, suppressNulls);
    }

    @Override
    protected boolean _isValuePresent(Possible<?> value) {
        return !value.isAbsent();
    }

    @Override
    protected Object _getReferenced(Possible<?> value) {
        return value.get(); // This will throw if value is absent.
    }

    @Nullable
    @Override
    protected Object _getReferencedIfPresent(Possible<?> value) {
        return value.isAbsent() ? null : value.get();
    }
}
