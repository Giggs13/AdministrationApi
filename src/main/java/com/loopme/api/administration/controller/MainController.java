package com.loopme.api.administration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping(value = "/userProfile")
    @ResponseBody
    public String getUserProfile() {
        return "Wright action!";
    }
}
