package net.celitech.celitech.services.purchases;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import net.celitech.celitech.validation.annotation.Length;

@Data
@Builder
public class TopUpEsimRequest {

  /**
   * ID of the eSIM
   */
  @NonNull
  @Length(min = 18, max = 22)
  private String iccid;

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
   * Email address where the purchase confirmation email will be sent (excluding QR Code & activation steps)
   */
  private String email;
  /**
   * Epoch value representing the start time of the package's validity. This timestamp can be set to the current time or any time within the next 12 months.
   */
  private Double startTime;
  /**
   * Epoch value representing the end time of the package's validity. End time can be maximum 90 days after Start time.
   */
  private Double endTime;
}
