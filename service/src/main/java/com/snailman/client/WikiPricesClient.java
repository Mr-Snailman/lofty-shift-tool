package com.snailman.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class WikiPricesClient {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${osrs.client.api.uri}")
  private String apiUri;
}

