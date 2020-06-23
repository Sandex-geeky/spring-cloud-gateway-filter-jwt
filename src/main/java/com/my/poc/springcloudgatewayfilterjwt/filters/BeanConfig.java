package com.my.poc.springcloudgatewayfilterjwt.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeanConfig {

    @Bean
    JwtTokenGenerator jwtTokenGenerator() {
        return new JwtTokenGenerator();
    }

    @Bean
    RolesPermissionsService rolesPermissionsService() {
        return new RolesPermissionsService();
    }

    @Bean
    WebClient webClient() {
        return WebClient.builder().build();
    }
}
