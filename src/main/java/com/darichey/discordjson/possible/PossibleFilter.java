package com.darichey.discordjson.possible;

import reactor.util.annotation.Nullable;

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
