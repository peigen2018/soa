package com.pg.soa.service.user.service;

import com.pg.soa.service.user.model.Role;
import com.pg.soa.service.user.model.User;
import com.pg.soa.service.user.repository.UserRepositories;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.swing.text.html.parser.Entity;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("user")
@CommonsLog
public class UserResource {
    @Autowired
    private UserRepositories repositories;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/{id}")
    public ResponseEntity<User> user(@PathVariable Long id) {
        log.info("-------------------user");
        Optional<User> u = repositories.findById(id);

        User data = u.get();
        data.getId();
        return ResponseEntity.ok(data);
    }

    @PostMapping()
    @Transactional
    public ResponseEntity<User> saveUser(User entity) {


        User u = new User();
        u.setUserName("user1");
        u.setPassword("password1");
        u.setCreateTime(new Date());
        u.setUpdateTime(new Date());
        repositories.save(u);


        Role r = new Role();
        r.setRoleName("role1");
        roleService.saveRole(r);


        throw new RuntimeException();
//        return ResponseEntity.ok(entity);
    }
}
