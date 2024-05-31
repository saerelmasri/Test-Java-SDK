package net.celitech.celitech.services.purchases;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class CreatePurchaseRequest {

  /**
   * ISO representation of the package's destination
   */
  @NonNull
  private String destination;

  /**
   * Size of the package in GB. The available options are 1, 2, 3, 5, 8, 20GB
   */
  @JsonProperty("dataLimitInGB")
  private double dataLimitInGb;

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
   * Email address where the purchase confirmation email will be sent (including QR Code & activation steps)
   */
  private String email;
  /**
   * Customize the network brand of the issued eSIM. This parameter is accessible to platforms with Diamond tier and requires an alphanumeric string of up to 15 characters
   */
  private String networkBrand;
  /**
   * Epoch value representing the start time of the package's validity. This timestamp can be set to the current time or any time within the next 12 months.
   */
  private Double startTime;
  /**
   * Epoch value representing the end time of the package's validity. End time can be maximum 90 days after Start time.
   */
  private Double endTime;
}
