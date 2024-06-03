package io.github.saerelmasri.celitech.services.esim;

import io.github.saerelmasri.celitech.validation.annotation.Length;
import java.util.List;
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
public class GetEsimHistoryOkResponse {

  private GetEsimHistoryOkResponseEsim esim;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class GetEsimHistoryOkResponseEsim {

    /**
     * ID of the eSIM
     */
    @Length(min = 18, max = 22)
    private String iccid;

    private List<History> history;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @ToString
    @EqualsAndHashCode
    public static class History {

      /**
       * The status of the eSIM at a given time, possible values are 'RELEASED', 'DOWNLOADED', 'INSTALLED', 'ENABLED', 'DELETED', or 'ERROR'
       */
      private String status;
      /**
       * The date when the eSIM status changed in the format 'yyyy-MM-ddThh:mm:ssZZ'
       */
      private String statusDate;
      /**
       * Epoch value representing the date when the eSIM status changed
       */
      private Double date;
    }
  }
}
