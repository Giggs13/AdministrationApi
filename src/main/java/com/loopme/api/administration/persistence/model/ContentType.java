package com.loopme.api.administration.persistence.model;

public enum ContentType {

    VIDEO(0), IMAGE(1), HTML(2);

    private int code;

    private ContentType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ContentType fromCode(int code) {
        for (ContentType status : ContentType.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new UnsupportedOperationException("The code " + code + " is not supported!");
    }
}
