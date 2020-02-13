package com.pg.soa.service.user.service;

import com.pg.soa.service.user.model.User;
import com.pg.soa.service.user.repository.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserResource {
    @Autowired
    private UserRepositories repositories;

    @GetMapping("/{id}")
    public ResponseEntity<User> user(@PathVariable Long id) {
        Optional<User> u = repositories.findById(id);

        User data = u.get();
        data.getId();
        return ResponseEntity.ok(data);
    }
}
