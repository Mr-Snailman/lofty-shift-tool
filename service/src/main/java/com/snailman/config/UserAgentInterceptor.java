package com.snailman.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

@Component
public class UserAgentInterceptor implements ClientHttpRequestInterceptor {

  @Value("${osrs.client.user-agent}")
  private String userAgent;

  @Override
  public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
    request.getHeaders().add(HttpHeaders.USER_AGENT, this.userAgent);
    return execution.execute(request, body);
  }
}

