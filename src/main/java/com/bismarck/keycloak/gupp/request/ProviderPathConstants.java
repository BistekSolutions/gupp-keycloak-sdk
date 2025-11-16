package com.bismarck.keycloak.gupp.request;

import static com.bismarck.keycloak.gupp.ProviderConstants.REST_PROVIDER_ID;

/**
 * Constant class, that holds all the basic endpoint path's for a request to the keycloak gupp rest provider
 *
 * @author n.bismarck
 * @since 0.1.0
 */
public class ProviderPathConstants {
    private ProviderPathConstants() {
        //enforce static usage
    }

    public static final String ROOT_PATH = "/" + REST_PROVIDER_ID;
    public static final String TENANT_PATH = "/tenant";
}
