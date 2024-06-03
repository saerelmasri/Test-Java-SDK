package io.github.saerelmasri.celitech.services.purchases;

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
public class EditPurchaseOkResponse {

  /**
   * ID of the purchase
   */
  private String purchaseId;
  /**
   * Start date of the package's validity in the format 'yyyy-MM-ddThh:mm:ssZZ'
   */
  private String newStartDate;
  /**
   * End date of the package's validity in the format 'yyyy-MM-ddThh:mm:ssZZ'
   */
  private String newEndDate;
  /**
   * Epoch value representing the new start time of the package's validity
   */
  private Double newStartTime;
  /**
   * Epoch value representing the new end time of the package's validity
   */
  private Double newEndTime;
}
