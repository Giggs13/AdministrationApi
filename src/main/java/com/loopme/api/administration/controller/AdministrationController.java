package com.loopme.api.administration.controller;

import com.loopme.api.administration.persistence.entity.AdminParameterEntity;
import com.loopme.api.administration.persistence.service.AdminParameterService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/administration")
public class AdministrationController {

    @Autowired
    private AdminParameterService persistenceService;

    @GetMapping
    public List<AdminParameterEntity> getAll() {
        return persistenceService.findAll();
    }

    @GetMapping(value = "/{id}")
    public AdminParameterEntity getById(@PathVariable String id) {
        return persistenceService.findById(id);
    }
}
