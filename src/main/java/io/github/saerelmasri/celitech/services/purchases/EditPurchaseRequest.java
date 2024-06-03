package io.github.saerelmasri.celitech.services.purchases;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class EditPurchaseRequest {

  /**
   * ID of the purchase
   */
  @NonNull
  private String purchaseId;

  /**
   * Start date of the package's validity in the format 'yyyy-MM-dd'. This date can be set to the current day or any day within the next 12 months.
   */
  @NonNull
  private String startDate;

  /**
   * End date of the package's validity in the format 'yyyy-MM-dd'. End date can be maximum 90 days after Start date.
   */
  @NonNull
  private String endDate;

  /**
   * Epoch value representing the start time of the package's validity. This timestamp can be set to the current time or any time within the next 12 months.
   */
  private Double startTime;
  /**
   * Epoch value representing the end time of the package's validity. End time can be maximum 90 days after Start time.
   */
  private Double endTime;
}
