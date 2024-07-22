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
public class TopUpEsimOkResponse {

  private TopUpEsimOkResponsePurchase purchase;

  private TopUpEsimOkResponseProfile profile;
}
