package com.pg.soa.service.user.config;

import com.pg.soa.service.user.utils.UserContextInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Configuration
public class RestClientConfig {

    @Bean
    public RestTemplate customRestTemplate() {
        RestTemplate template = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = template.getInterceptors();


        if (interceptors == null) {
            template.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
        } else {
            interceptors.add((ClientHttpRequestInterceptor) new UserContextInterceptor());
            template.setInterceptors(interceptors);

        }

        return template;
    }
}
