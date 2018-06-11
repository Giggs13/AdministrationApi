package com.loopme.api.administration.persistence.service.impl;

import com.google.common.collect.Lists;
import com.loopme.api.administration.persistence.entity.ApplicationEntity;
import com.loopme.api.administration.persistence.repository.ApplicationEntityRepository;
import com.loopme.api.administration.persistence.service.ApplicationEntityService;
import com.loopme.api.administration.service.ServiceNames;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("applicationEntityService")
public class ApplicationEntityServiceImpl
        implements ApplicationEntityService {

    @Autowired
    private ApplicationEntityRepository repository;

    @Override
    public ServiceNames getServiceName() {
        return ServiceNames.APPLICATION_ENTITY_SERVICE;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ApplicationEntity> findAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public ApplicationEntity findById(String id) {
        return repository.getOne(id);
    }
}
