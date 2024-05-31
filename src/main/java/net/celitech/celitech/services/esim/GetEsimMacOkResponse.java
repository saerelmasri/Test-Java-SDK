package net.celitech.celitech.services.esim;

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
public class GetEsimMacOkResponse {

  private GetEsimMacOkResponseEsim esim;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class GetEsimMacOkResponseEsim {

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
  }
}
