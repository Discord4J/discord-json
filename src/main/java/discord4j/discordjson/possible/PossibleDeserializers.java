package discord4j.discordjson.possible;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import reactor.util.annotation.Nullable;

public class PossibleDeserializers extends Deserializers.Base {

    @Nullable
    @Override
    public JsonDeserializer<?> findReferenceDeserializer(ReferenceType refType, DeserializationConfig config, BeanDescription beanDesc, TypeDeserializer contentTypeDeserializer, JsonDeserializer<?> contentDeserializer) throws JsonMappingException {
        if (refType.isTypeOrSubTypeOf(Possible.class)) {
            return new PossibleDeserializer(refType, null, contentTypeDeserializer, contentDeserializer);
        }
        return null;
    }
}
