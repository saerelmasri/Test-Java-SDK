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
public class CreatePurchaseOkResponsePurchase {

  /**
   * ID of the purchase
   */
  private String id;

  /**
   * ID of the package
   */
  private String packageId;

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
}
