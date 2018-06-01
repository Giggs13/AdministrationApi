package com.loopme.api.administration.persistence.service;

import com.loopme.api.administration.persistence.entity.AdminParameterEntity;
import java.util.List;

public interface AdminParameterService
        extends PersistenceService {

    List<AdminParameterEntity> findAll();

    AdminParameterEntity findById(String id);
}
