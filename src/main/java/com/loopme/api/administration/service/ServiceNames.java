package com.loopme.api.administration.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceNames {

    ADMIN_PARAMETER_SERVICE("adminParameterService");

    private final String serviceName;
}
