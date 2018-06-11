package com.loopme.api.administration.persistence.model;

public enum ApplicationType {

    IOS(0), ANDROID(1), WEBSITE(2);

    private int code;

    private ApplicationType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ApplicationType fromCode(int code) {
        for (ApplicationType status : ApplicationType.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new UnsupportedOperationException("The code " + code + " is not supported!");
    }
}
