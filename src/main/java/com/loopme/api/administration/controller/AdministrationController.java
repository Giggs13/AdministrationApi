package com.loopme.api.administration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
