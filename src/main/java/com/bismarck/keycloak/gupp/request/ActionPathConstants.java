package com.bismarck.keycloak.gupp.request;

/**
 * Constant class, that holds all the required action endpoint paths for a controller
 * Usually used in combination with {@link ActionPathConstants}
 * To add a tenant to the keycloak, you e.g. would use:
 * {@link ProviderPathConstants#ROOT_PATH} + {@link ProviderPathConstants#TENANT_PATH} + {@link #ADD_PATH}
 *
 * @author n.bismarck
 * @since 0.1.0
 */
public class ActionPathConstants {
    public static final String ALL_PATH = "/getAll";
    public static final String ID_PATH = "/getById";
    public static final String ADD_PATH = "/add";
    public static final String SYNC_PATH = "/sync";
    public static final String EDIT_PATH = "/edit";
    public static final String DELETE_PATH = "/delete";
}
