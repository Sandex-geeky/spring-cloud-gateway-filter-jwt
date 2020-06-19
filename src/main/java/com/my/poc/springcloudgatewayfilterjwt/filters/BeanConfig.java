package com.my.poc.springcloudgatewayfilterjwt.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    JwtTokenGenerator jwtTokenGenerator() {
        return new JwtTokenGenerator();
    }
}
