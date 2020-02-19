package com.discord4j.discordjson.possible;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

public class PossibleModule extends Module {

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
        context.addDeserializers(new PossibleDeserializers());
        context.addTypeModifier(new PossibleTypeModifier());
    }
}
