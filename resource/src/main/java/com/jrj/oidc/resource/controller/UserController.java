package com.jrj.oidc.resource.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
//@PreAuthorize("hasRole('USER')")
@Slf4j
public class UserController {

    @RequestMapping("/")
    public String resource() {
        log.info("API DATA");
        return "{\"aaaaa\":\"API DATA\"}";
    }

}
