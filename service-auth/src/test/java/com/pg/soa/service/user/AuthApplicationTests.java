package com.pg.soa.service.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

class AuthApplicationTests {

    @Test
    void contextLoads() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(10));
        }
    }

}
