package com.loopme.api.administration.persistence.service.impl;

import com.google.common.collect.Lists;
import com.loopme.api.administration.persistence.entity.AdminParameterEntity;
import com.loopme.api.administration.persistence.repository.AdminParameterRepository;
import com.loopme.api.administration.persistence.service.AdminParameterService;
import com.loopme.api.administration.service.ServiceNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service("adminParameterService")
public class AdminParameterServiceImpl
        implements AdminParameterService {

    @Autowired
    private AdminParameterRepository repository;

    @Override
    public ServiceNames getServiceName() {
        return ServiceNames.ADMIN_PARAMETER_SERVICE;
    }

    @Override
    @Transactional(readOnly = true)
    public List<AdminParameterEntity> findAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public AdminParameterEntity findById(String id) {
        return repository.getOne(id);
    }
}
