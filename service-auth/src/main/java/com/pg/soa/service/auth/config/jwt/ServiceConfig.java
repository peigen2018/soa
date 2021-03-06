package com.pg.soa.service.auth.config.jwt;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class ServiceConfig {
    @Value("${signing.key}")
    private String jwtSigningKey;
}
