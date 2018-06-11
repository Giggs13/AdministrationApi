package com.loopme.api.administration.controller;

import com.loopme.api.administration.persistence.entity.UserEntity;
import com.loopme.api.administration.persistence.service.UserEntityService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserDirectoryController {

    @Autowired
    private UserEntityService persistenceService;

    @GetMapping
    public List<UserEntity> getAll() {
        return persistenceService.findAll();
    }

    @GetMapping(value = "/{id}")
    public UserEntity getById(@PathVariable String id) {
        return persistenceService.findById(id);
    }
}
