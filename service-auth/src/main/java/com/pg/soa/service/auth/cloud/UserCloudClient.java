package com.pg.soa.service.auth.cloud;

import com.pg.soa.service.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserCloudClient {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<User> get(Long id) {
        return restTemplate.getForEntity("http://SERVICE-USER/user/" + id, User.class);
    }
}
