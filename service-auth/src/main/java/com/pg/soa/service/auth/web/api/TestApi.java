package com.pg.soa.service.auth.web.api;

import com.pg.soa.service.auth.model.User;
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
    private WebClient.Builder webclientBuilder;

    @GetMapping(value = "/{id}")
    public Mono<User> get(@PathVariable Long id) {
        return webclientBuilder.build()
                .get()
                .uri("http://SERVICE-USER/user/" + id)
                .retrieve()
                .bodyToMono(User.class);
    }
}
