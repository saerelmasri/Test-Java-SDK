package net.celitech.celitech.http;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum HttpMethod {
  GET("GET"),
  POST("POST"),
  PUT("PUT"),
  PATCH("PATCH"),
  DELETE("DELETE"),
  HEAD("HEAD"),
  OPTIONS("OPTIONS"),
  TRACE("TRACE"),
  CONNECT("CONNECT");

  private final String method;
}
