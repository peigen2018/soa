package com.pg.soa.service.user.service;

import com.pg.soa.service.user.model.User;
import com.pg.soa.service.user.repository.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService {
    @Autowired
    private UserRepositories repositories;

    @Transactional(propagation = Propagation.NESTED)
    public User saveUser(User entity) {
        return repositories.save(entity);
    }
}
