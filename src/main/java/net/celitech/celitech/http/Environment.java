package net.celitech.celitech.http;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * SDK Environments
 */
@Getter
@RequiredArgsConstructor
public enum Environment {
  DEFAULT("https://api.celitech.net/v1"),
  PRODUCTION("https://api.celitech.net/v1"),
  SANDBOX("https://1bki1q3be6.execute-api.us-east-1.amazonaws.com/qa");

  private final String url;
}
