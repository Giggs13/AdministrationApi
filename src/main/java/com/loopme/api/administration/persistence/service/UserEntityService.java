package com.loopme.api.administration.persistence.service;

import com.loopme.api.administration.persistence.entity.UserEntity;
import java.util.List;

public interface UserEntityService
        extends PersistenceService {

    List<UserEntity> findAll();

    UserEntity findById(String id);
}
