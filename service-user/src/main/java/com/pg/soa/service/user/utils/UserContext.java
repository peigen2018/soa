package com.pg.soa.service.user.utils;

import lombok.Getter;


public class UserContext {

    public static final String CORRELATION_ID = "tmx-correlation-id";
    public static final String AUTH_TOKEN = "Authorization";

    private static final ThreadLocal<String> correlationId = new ThreadLocal<String>();
    private static final ThreadLocal<String> authToken = new ThreadLocal<String>();


    public static String getCorrelationId() {
        return correlationId.get();
    }

    public static void setCorrelationId(String cid) {
        correlationId.set(cid);
    }

    public static String getAuthToken() {
        return authToken.get();
    }

    public static void setAuthToken(String aToken) {
        authToken.set(aToken);
    }
}
