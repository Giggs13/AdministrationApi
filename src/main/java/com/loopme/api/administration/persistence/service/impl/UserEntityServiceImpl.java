package com.loopme.api.administration.persistence.service.impl;

import com.google.common.collect.Lists;
import com.loopme.api.administration.persistence.entity.UserEntity;
import com.loopme.api.administration.persistence.repository.UserEntityRepository;
import com.loopme.api.administration.persistence.service.UserEntityService;
import com.loopme.api.administration.service.ServiceNames;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userEntityService")
public class UserEntityServiceImpl
        implements UserEntityService {

    @Autowired
    private UserEntityRepository repository;

    @Override
    public ServiceNames getServiceName() {
        return ServiceNames.USER_ENTITY_SERVICE;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserEntity> findAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public UserEntity findById(String id) {
        return repository.getOne(id);
    }
}
