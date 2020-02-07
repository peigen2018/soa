package com.pg.soa.service.auth.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pg.soa.service.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Random;

@Component
public class UserService {
    @Autowired
    private WebClient.Builder webclientBuilder;

    @HystrixCommand(fallbackMethod = "fallbackGetUser")
    public Mono<User> get(Long id) throws InterruptedException {

        Random r = new Random();
        int i = r.nextInt(10);
        System.out.println(i);
        if (i % 3 == 0) {
            Thread.sleep(10000);
        }

        return webclientBuilder.build()
                .get()
                .uri("http://SERVICE-USER/user/" + id)
                .retrieve()
                .bodyToMono(User.class);
    }

    public Mono<User> fallbackGetUser(Long id) throws InterruptedException {
        User u = new User();
        u.setUserName("userName");
        return Mono.just(u);
    }
}
