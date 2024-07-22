package io.github.saerelmasri.celitech.models;

import io.github.saerelmasri.celitech.validation.annotation.Length;
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
public class CreatePurchaseOkResponseProfile {

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
