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
public class GetEsimOkResponseEsim {

  /**
   * ID of the eSIM
   */
  @Length(min = 18, max = 22)
  private String iccid;

  /**
   * SM-DP+ Address
   */
  private String smdpAddress;

  /**
   * The manual activation code
   */
  private String manualActivationCode;

  /**
   * Status of the eSIM, possible values are 'RELEASED', 'DOWNLOADED', 'INSTALLED', 'ENABLED', 'DELETED', or 'ERROR'
   */
  private String status;
}
