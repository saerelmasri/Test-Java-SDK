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
public class Device {

  /**
   * Name of the OEM
   */
  private String oem;

  /**
   * Name of the Device
   */
  private String hardwareName;

  /**
   * Model of the Device
   */
  private String hardwareModel;

  /**
   * Serial Number of the eSIM
   */
  private String eid;
}
