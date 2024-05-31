package net.celitech.celitech.services.purchases;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.celitech.celitech.validation.annotation.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class ListPurchasesOkResponse {

  private List<Purchases> purchases;
  /**
   * The cursor value representing the end of the current page of results. Use this cursor value as the "afterCursor" parameter in your next request to retrieve the subsequent page of results. It ensures that you continue fetching data from where you left off, facilitating smooth pagination.
   */
  private String afterCursor;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class Purchases {

    /**
     * ID of the purchase
     */
    private String id;
    /**
     * Start date of the package's validity in the format 'yyyy-MM-ddThh:mm:ssZZ'
     */
    private String startDate;
    /**
     * End date of the package's validity in the format 'yyyy-MM-ddThh:mm:ssZZ'
     */
    private String endDate;
    /**
     * Creation date of the purchase in the format 'yyyy-MM-ddThh:mm:ssZZ'
     */
    private String createdDate;
    /**
     * Epoch value representing the start time of the package's validity
     */
    private Double startTime;
    /**
     * Epoch value representing the end time of the package's validity
     */
    private Double endTime;
    /**
     * Epoch value representing the date of creation of the purchase
     */
    private Double createdAt;

    @JsonProperty("package")
    private Package_ package_;

    private PurchasesEsim esim;
    /**
     * The source indicates where the eSIM was purchased, which can be from the API, dashboard, or landing-page. For purchases made before September 8, 2023, the value will be displayed as 'Not available'.
     */
    private String source;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode
    public static class Package_ {

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

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode
    public static class PurchasesEsim {

      /**
       * ID of the eSIM
       */
      @Length(min = 18, max = 22)
      private String iccid;
    }
  }
}
