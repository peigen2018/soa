package com.pg.soa.service.user.repository;

import com.pg.soa.service.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends CrudRepository<User, Long> {
}
