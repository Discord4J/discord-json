package com.discord4j.discordjson.possible;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import reactor.util.annotation.Nullable;

import java.util.Optional;

public class PossibleDeserializer extends ReferenceTypeDeserializer<Possible<?>> {

    public PossibleDeserializer(JavaType fullType, @Nullable ValueInstantiator vi, TypeDeserializer typeDeser, JsonDeserializer<?> deser) {
        super(fullType, vi, typeDeser, deser);
    }

    @Override
    protected PossibleDeserializer withResolved(TypeDeserializer typeDeser, JsonDeserializer<?> valueDeser) {
        return new PossibleDeserializer(_fullType, _valueInstantiator, typeDeser, valueDeser);
    }

    @Override
    public Possible<?> getNullValue(DeserializationContext ctxt) {
        return Possible.of(Optional.empty());
    }

    @Override
    public Possible<?> referenceValue(Object contents) {
        return Possible.of(contents);
    }

    @Override
    public Possible<?> updateReference(Possible<?> reference, Object contents) {
        return Possible.of(contents); // Possible is immutable. The old reference is irrelevant.
    }

    @Nullable
    @Override
    public Object getReferenced(Possible<?> reference) {
        return reference.toOptional().orElse(null);
    }
}
