package io.github.saerelmasri.celitech.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Package_ {

  /**
   * ID of the package
   */
  private String id;

  /**
   * Size of the package in Bytes
   */
  private Double dataLimitInBytes;

  /**
   * ISO representation of the package's destination
   */
  private String destination;

  /**
   * Name of the package's destination
   */
  private String destinationName;

  /**
   * Price of the package in cents
   */
  private Double priceInCents;
}
