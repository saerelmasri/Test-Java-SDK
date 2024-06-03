package io.github.saerelmasri.celitech.services.packages;

import java.util.List;
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
public class ListPackagesOkResponse {

  private List<Packages> packages;
  /**
   * The cursor value representing the end of the current page of results. Use this cursor value as the "afterCursor" parameter in your next request to retrieve the subsequent page of results. It ensures that you continue fetching data from where you left off, facilitating smooth pagination
   */
  private String afterCursor;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class Packages {

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
}
