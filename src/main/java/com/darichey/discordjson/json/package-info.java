@Value.Style(
        jdkOnly = true,
        allParameters = true,
        defaults = @Value.Immutable(
                copy = false
        ),
        defaultAsDefault = true
)
@NonNullApi
package com.darichey.discordjson.json;

import org.immutables.value.Value;
import reactor.util.annotation.NonNullApi;