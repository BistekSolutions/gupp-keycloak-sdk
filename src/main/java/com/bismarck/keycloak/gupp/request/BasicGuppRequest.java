package com.bismarck.keycloak.gupp.request;

import java.math.BigInteger;

/**
 * Basic implementation of a GuppRequest, that only includes the {@link #user}
 *
 * @author n.bismarck
 * @since 0.1.0
 */
public class BasicGuppRequest implements GuppRequest {

    public BasicGuppRequest() {}

    private BigInteger user;

    @Override
    public BigInteger getUser() {
        return user;
    }

    @Override
    public void setUser(BigInteger user) {
        this.user = user;
    }
}
