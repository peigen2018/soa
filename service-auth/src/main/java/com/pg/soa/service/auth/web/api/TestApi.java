package com.pg.soa.service.auth.web.api;

import com.pg.soa.service.auth.cloud.UserCloudClient;
import com.pg.soa.service.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("test")
public class TestApi {
    @Autowired
    private UserCloudClient service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> get(@PathVariable Long id) throws InterruptedException {
        return service.get(id);
    }

    @GetMapping(value = "/auth")
    public ResponseEntity<Authentication> auth(OAuth2Authentication user) throws InterruptedException {
        Authentication userAuthentication = user.getUserAuthentication();
        return ResponseEntity.ok(user);
    }
}
