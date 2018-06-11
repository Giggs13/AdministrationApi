package com.loopme.api.administration.persistence.service;

import com.loopme.api.administration.persistence.entity.ApplicationEntity;
import java.util.List;

public interface ApplicationEntityService
        extends PersistenceService {

    List<ApplicationEntity> findAll();

    ApplicationEntity findById(String id);
}
