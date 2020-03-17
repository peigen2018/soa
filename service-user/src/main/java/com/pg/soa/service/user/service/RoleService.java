package com.pg.soa.service.user.service;

import com.pg.soa.service.user.model.Role;
import com.pg.soa.service.user.model.User;
import com.pg.soa.service.user.repository.RoleRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Component
public class RoleService {
    @Autowired
    private RoleRepositories repositories;

    @Autowired
    private UserService userService;


    @Transactional(propagation = Propagation.NESTED)
    public Role saveRole(Role entity) {

        User u = new User();
        u.setUserName("user2");
        u.setPassword("password2");
        u.setCreateTime(new Date());
        u.setUpdateTime(new Date());
        userService.saveUser(u);

        repositories.save(entity);
        throw new RuntimeException();
    }
}
