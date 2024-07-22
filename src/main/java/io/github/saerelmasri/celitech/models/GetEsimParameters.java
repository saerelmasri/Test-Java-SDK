package io.github.saerelmasri.celitech.models;

import io.github.saerelmasri.celitech.validation.annotation.Length;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class GetEsimParameters {

  /**
   * ID of the eSIM
   */
  @NonNull
  @Length(min = 18, max = 22)
  private String iccid;
}
