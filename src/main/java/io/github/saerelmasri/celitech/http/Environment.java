package io.github.saerelmasri.celitech.http;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * SDK Environments
 */
@Getter
@RequiredArgsConstructor
public enum Environment {
  DEFAULT("https://api.celitech.net/v1");

  private final String url;
}
