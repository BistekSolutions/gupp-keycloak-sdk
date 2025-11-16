package com.bismarck.keycloak.gupp;

/**
 * Constant class, that gets uses by the gupp-user-provider-spi, to define the provider id's
 *
 * @author n.bismarck
 * @since 0.1.0
 */
public class ProviderConstants {

    private ProviderConstants() {
        //enforce static usage
    }

    public static final String USER_PROVIDER_ID = "Gupp-DB";
    public static final String REST_PROVIDER_ID = "gupp";
}
