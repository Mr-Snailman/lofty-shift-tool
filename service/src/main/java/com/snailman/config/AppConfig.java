package com.snailman.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder, UserAgentInterceptor userAgent) {
    return restTemplateBuilder.additionalInterceptors(userAgent).build();
  }
}

