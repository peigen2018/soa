package com.pg.soa.cloud.configer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigerApplication.class, args);
    }

}
