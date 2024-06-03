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
public class GetPurchaseConsumptionOkResponse {

  /**
   * Remaining balance of the package in bytes
   */
  private Double dataUsageRemainingInBytes;
  /**
   * Status of the connectivity, possible values are 'ACTIVE' or 'NOT_ACTIVE'
   */
  private String status;
}
