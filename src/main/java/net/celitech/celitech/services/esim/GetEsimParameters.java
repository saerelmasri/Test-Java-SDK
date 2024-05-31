package net.celitech.celitech.services.esim;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import net.celitech.celitech.validation.annotation.Length;

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
