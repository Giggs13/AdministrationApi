package com.loopme.api.administration.persistence.repository;

import com.loopme.api.administration.persistence.entity.AdminParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminParameterRepository
        extends JpaRepository<AdminParameterEntity, String> {

}
