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
public class PurchasesEsim {

  /**
   * ID of the eSIM
   */
  @Length(min = 18, max = 22)
  private String iccid;
}
