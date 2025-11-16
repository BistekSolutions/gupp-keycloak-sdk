package com.bismarck.keycloak.gupp.request;

import java.math.BigInteger;

/**
 * Interface for a request implemented by the gupp-user-provider-sdk
 *
 * @author n.bismarck
 * @since 0.1.0
 */
public interface GuppRequest {

    BigInteger getUser();
    void setUser(BigInteger user);
}
