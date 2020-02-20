package discord4j.discordjson.possible;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.ReferenceType;
import reactor.util.annotation.Nullable;

public class PossibleSerializers extends Serializers.Base {

    @Nullable
    @Override
    public JsonSerializer<?> findReferenceSerializer(SerializationConfig config, ReferenceType type, BeanDescription beanDesc, TypeSerializer contentTypeSerializer, JsonSerializer<Object> contentValueSerializer) {
        boolean staticTyping = config.isEnabled(MapperFeature.USE_STATIC_TYPING);

        if (type.isTypeOrSubTypeOf(Possible.class)) {
            return new PossibleSerializer(type, staticTyping, contentTypeSerializer, contentValueSerializer);
        }
        return null;
    }
}
