# PurchasesService

A list of all methods in the `PurchasesService` service. Click on the method name to view detailed information about that method.

| Methods                                           | Description                                                                                                                                                                                                                                                                                                            |
| :------------------------------------------------ | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [listPurchases](#listpurchases)                   | This endpoint can be used to list all the successful purchases made between a given interval.                                                                                                                                                                                                                          |
| [createPurchase](#createpurchase)                 | This endpoint is used to purchase a new eSIM by providing the package details.                                                                                                                                                                                                                                         |
| [topUpEsim](#topupesim)                           | This endpoint is used to top-up an eSIM with the previously associated destination by providing an existing ICCID and the package details. The top-up is not feasible for eSIMs in "DELETED" or "ERROR" state.                                                                                                         |
| [editPurchase](#editpurchase)                     | This endpoint allows you to modify the dates of an existing package with a future activation start time. Editing can only be performed for packages that have not been activated, and it cannot change the package size. The modification must not change the package duration category to ensure pricing consistency. |
| [getPurchaseConsumption](#getpurchaseconsumption) | This endpoint can be called for consumption notifications (e.g. every 1 hour or when the user clicks a button). It returns the data balance (consumption) of purchased packages.                                                                                                                                       |

## listPurchases

This endpoint can be used to list all the successful purchases made between a given interval.

- HTTP Method: `GET`
- Endpoint: `/purchases`

**Parameters**

| Name              | Type                                                            | Required | Description               |
| :---------------- | :-------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [ListPurchasesParameters](../models/ListPurchasesParameters.md) | ❌       | Request Parameters Object |

**Return Type**

`ListPurchasesOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.ListPurchasesOkResponse;
import io.github.saerelmasri.celitech.models.ListPurchasesParameters;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    ListPurchasesOkResponse response = celitech.purchasesService.listPurchases();

    System.out.println(response);
  }
}

```

## createPurchase

This endpoint is used to purchase a new eSIM by providing the package details.

- HTTP Method: `POST`
- Endpoint: `/purchases`

**Parameters**

| Name                  | Type                                                        | Required | Description  |
| :-------------------- | :---------------------------------------------------------- | :------- | :----------- |
| createPurchaseRequest | [CreatePurchaseRequest](../models/CreatePurchaseRequest.md) | ✅       | Request Body |

**Return Type**

`CreatePurchaseOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.CreatePurchaseOkResponse;
import io.github.saerelmasri.celitech.models.CreatePurchaseRequest;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    CreatePurchaseRequest createPurchaseRequest = CreatePurchaseRequest
      .builder()
      .destination("FRA")
      .dataLimitInGb(1D)
      .startDate("2023-11-01")
      .endDate("2023-11-20")
      .build();

    CreatePurchaseOkResponse response = celitech.purchasesService.createPurchase(createPurchaseRequest);

    System.out.println(response);
  }
}

```

## topUpEsim

This endpoint is used to top-up an eSIM with the previously associated destination by providing an existing ICCID and the package details. The top-up is not feasible for eSIMs in "DELETED" or "ERROR" state.

- HTTP Method: `POST`
- Endpoint: `/purchases/topup`

**Parameters**

| Name             | Type                                              | Required | Description  |
| :--------------- | :------------------------------------------------ | :------- | :----------- |
| topUpEsimRequest | [TopUpEsimRequest](../models/TopUpEsimRequest.md) | ✅       | Request Body |

**Return Type**

`TopUpEsimOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.TopUpEsimOkResponse;
import io.github.saerelmasri.celitech.models.TopUpEsimRequest;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    TopUpEsimRequest topUpEsimRequest = TopUpEsimRequest
      .builder()
      .iccid("1111222233334444555")
      .dataLimitInGb(1D)
      .startDate("2023-11-01")
      .endDate("2023-11-20")
      .build();

    TopUpEsimOkResponse response = celitech.purchasesService.topUpEsim(topUpEsimRequest);

    System.out.println(response);
  }
}

```

## editPurchase

This endpoint allows you to modify the dates of an existing package with a future activation start time. Editing can only be performed for packages that have not been activated, and it cannot change the package size. The modification must not change the package duration category to ensure pricing consistency.

- HTTP Method: `POST`
- Endpoint: `/purchases/edit`

**Parameters**

| Name                | Type                                                    | Required | Description  |
| :------------------ | :------------------------------------------------------ | :------- | :----------- |
| editPurchaseRequest | [EditPurchaseRequest](../models/EditPurchaseRequest.md) | ✅       | Request Body |

**Return Type**

`EditPurchaseOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.EditPurchaseOkResponse;
import io.github.saerelmasri.celitech.models.EditPurchaseRequest;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    EditPurchaseRequest editPurchaseRequest = EditPurchaseRequest
      .builder()
      .purchaseId("ae471106-c8b4-42cf-b83a-b061291f2922")
      .startDate("2023-11-01")
      .endDate("2023-11-20")
      .build();

    EditPurchaseOkResponse response = celitech.purchasesService.editPurchase(editPurchaseRequest);

    System.out.println(response);
  }
}

```

## getPurchaseConsumption

This endpoint can be called for consumption notifications (e.g. every 1 hour or when the user clicks a button). It returns the data balance (consumption) of purchased packages.

- HTTP Method: `GET`
- Endpoint: `/purchases/{purchaseId}/consumption`

**Parameters**

| Name       | Type   | Required | Description        |
| :--------- | :----- | :------- | :----------------- |
| purchaseId | String | ✅       | ID of the purchase |

**Return Type**

`GetPurchaseConsumptionOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.GetPurchaseConsumptionOkResponse;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    GetPurchaseConsumptionOkResponse response = celitech.purchasesService.getPurchaseConsumption(
      "4973fa15-6979-4daa-9cf3-672620df819c"
    );

    System.out.println(response);
  }
}

```
