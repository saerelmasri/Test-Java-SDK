package net.celitech.celitech.services.destinations;

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
public class ListDestinationsOkResponse {

  private List<Destinations> destinations;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @ToString
  @EqualsAndHashCode
  public static class Destinations {

    /**
     * Name of the destination
     */
    private String name;
    /**
     * ISO representation of the destination
     */
    private String destination;
    private List<String> supportedCountries;
  }
}
