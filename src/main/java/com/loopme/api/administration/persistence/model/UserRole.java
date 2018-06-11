package com.loopme.api.administration.persistence.model;

public enum UserRole {

    ADMIN(0), ADOPS(1), PUBLISHER(2);

    private int code;

    private UserRole(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserRole fromCode(int code) {
        for (UserRole status : UserRole.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new UnsupportedOperationException("The code " + code + " is not supported!");
    }
}
