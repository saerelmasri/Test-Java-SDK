package net.celitech.celitech.services.purchases;

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
public class CreatePurchaseOkResponse {

  private CreatePurchaseOkResponsePurchase purchase;
  private CreatePurchaseOkResponseProfile profile;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class CreatePurchaseOkResponsePurchase {

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

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class CreatePurchaseOkResponseProfile {

    /**
     * ID of the eSIM
     */
    @Length(min = 18, max = 22)
    private String iccid;

    /**
     * QR Code of the eSIM as base64
     */
    @Length(min = 1000, max = 8000)
    private String activationCode;
  }
}
