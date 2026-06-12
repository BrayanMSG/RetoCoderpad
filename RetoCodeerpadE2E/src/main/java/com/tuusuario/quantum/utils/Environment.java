package com.tuusuario.quantum.utils;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class Environment {

    private static final EnvironmentVariables VARIABLES =
            SystemEnvironmentVariables.createEnvironmentVariables();

    private Environment() {
    }

    public static String get(String property) {
        return EnvironmentSpecificConfiguration
                .from(VARIABLES)
                .getProperty(property);
    }
}