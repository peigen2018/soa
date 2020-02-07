package com.pg.soa.service.auth.web.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pg.soa.service.auth.model.User;
import com.pg.soa.service.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("test")
public class TestApi {
    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}")
    public Mono<User> get(@PathVariable Long id) throws InterruptedException {
        return service.get(id);
    }
}
