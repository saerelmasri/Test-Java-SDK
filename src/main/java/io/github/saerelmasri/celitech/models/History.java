package io.github.saerelmasri.celitech.models;

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
public class History {

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
