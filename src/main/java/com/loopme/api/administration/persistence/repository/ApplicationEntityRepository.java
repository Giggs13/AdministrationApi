package com.loopme.api.administration.persistence.repository;

import com.loopme.api.administration.persistence.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationEntityRepository
        extends JpaRepository<ApplicationEntity, String> {

}
