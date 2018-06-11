package com.loopme.api.administration.controller;

import com.loopme.api.administration.persistence.entity.ApplicationEntity;
import com.loopme.api.administration.persistence.service.ApplicationEntityService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/applications")
public class ApplicationDirectoryController {

    @Autowired
    private ApplicationEntityService persistenceService;

    @GetMapping
    public List<ApplicationEntity> getAll() {
        return persistenceService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ApplicationEntity getById(@PathVariable String id) {
        return persistenceService.findById(id);
    }
}
