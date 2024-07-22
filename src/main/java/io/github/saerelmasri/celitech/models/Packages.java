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
public class Packages {

  /**
   * ID of the package
   */
  private String id;

  /**
   * ISO representation of the package's destination
   */
  private String destination;

  /**
   * Size of the package in Bytes
   */
  private Double dataLimitInBytes;

  /**
   * Min number of days for the package
   */
  private Double minDays;

  /**
   * Max number of days for the package
   */
  private Double maxDays;

  /**
   * Price of the package in cents
   */
  private Double priceInCents;
}
