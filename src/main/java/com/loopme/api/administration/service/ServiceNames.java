package com.loopme.api.administration.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceNames {

    APPLICATION_ENTITY_SERVICE("applicationEntityService"),
    USER_ENTITY_SERVICE("userEntityService");

    private final String serviceName;
}
