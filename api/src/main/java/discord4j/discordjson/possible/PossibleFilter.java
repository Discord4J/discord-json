package discord4j.discordjson.possible;

import javax.annotation.Nullable;

public class PossibleFilter {

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        } else if (Possible.class.isAssignableFrom(obj.getClass())) {
            return ((Possible<?>) obj).isAbsent();
        }

        return false;
    }
}
