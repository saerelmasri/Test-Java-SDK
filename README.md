# Celitech Java SDK 1.1.4

A Java SDK for Celitech.

- API version: 1.1.0
- SDK version: 1.1.4

Welcome to the CELITECH API documentation! Useful links: [Homepage](https://www.celitech.com) | [Support email](mailto:support@celitech.com) | [Blog](https://www.celitech.com/blog/)

## Table of Contents

- [Installation](#installation)
- [Environments](#environments)

## Installation

If you use Maven, place the following within the _dependency_ tag in your pom.xml file:

```XML
<dependency>
  <groupId>io.github.saerelmasri</groupId>
  <artifactId>Celitech</artifactId>
  <version>1.1.4</version>
</dependency>
```

If you use Gradle, paste the next line inside the _dependencies_ block of your build.gradle file:

```Gradle
implementation group: io.github.saerelmasri, name: Celitech, version: 1.1.4
```

## Environments

Here is the list of all available environment variables:

```java
DEFAULT("https://api.celitech.net/v1"),
PRODUCTION("https://api.celitech.net/v1"),
SANDBOX("https://1bki1q3be6.execute-api.us-east-1.amazonaws.com/qa");
```

Here is how you set an environment:

```java
import io.github.saerelmasri.celitech.http.Environment;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().build();
    Celitech celitech = new Celitech(config);

    celitech.setEnvironment(Environment.DEFAULT);
  }
}

```

## Services

A list of all SDK services. Click on the service name to access its corresponding service methods.

| Service                                     |
| :------------------------------------------ |
| [DestinationsService](#destinationsservice) |
| [PackagesService](#packagesservice)         |
| [PurchasesService](#purchasesservice)       |
| [ESimService](#esimservice)                 |

### DestinationsService

A list of all methods in the `DestinationsService` service. Click on the method name to view detailed information about that method.

| Methods                               | Description              |
| :------------------------------------ | :----------------------- |
| [listDestinations](#listdestinations) | Name of the destinations |

#### **listDestinations**

Name of the destinations

- HTTP Method: `GET`
- Endpoint: `/destinations`

**Parameters**

| Name | Type | Required | Description |
| :--- | :--- | :------: | :---------- |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.destinations.ListDestinationsOkResponse;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    ListDestinationsOkResponse response = celitech.destinationsService.listDestinations();

    System.out.println(response);
  }
}

```

### PackagesService

A list of all methods in the `PackagesService` service. Click on the method name to view detailed information about that method.

| Methods                       | Description                |
| :---------------------------- | :------------------------- |
| [listPackages](#listpackages) | List of available packages |

#### **listPackages**

List of available packages

- HTTP Method: `GET`
- Endpoint: `/packages`

**Parameters**

| Name              | Type                   | Required | Description               |
| :---------------- | :--------------------- | :------: | :------------------------ |
| requestParameters | ListPackagesParameters |    ❌    | Request Parameters Object |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.packages.ListPackagesOkResponse;
import io.github.saerelmasri.celitech.services.packages.ListPackagesParameters;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    ListPackagesOkResponse response = celitech.packagesService.listPackages();

    System.out.println(response);
  }
}

```

### PurchasesService

A list of all methods in the `PurchasesService` service. Click on the method name to view detailed information about that method.

| Methods                                           | Description                                                                                                                                                                                                                                                                                                            |
| :------------------------------------------------ | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [listPurchases](#listpurchases)                   | This endpoint can be used to list all the successful purchases made between a given interval.                                                                                                                                                                                                                          |
| [createPurchase](#createpurchase)                 | This endpoint is used to purchase a new eSIM by providing the package details.                                                                                                                                                                                                                                         |
| [topUpEsim](#topupesim)                           | This endpoint is used to top-up an eSIM with the previously associated destination by providing an existing ICCID and the package details. The top-up is not feasible for eSIMs in "DELETED" or "ERROR" state.                                                                                                         |
| [editPurchase](#editpurchase)                     | This endpoint allows you to modify the dates of an existing package with a future activation start time. Editing can only be performed for packages that have not been activated, and it cannot change the package size. The modification must not change the package duration category to ensure pricing consistency. |
| [getPurchaseConsumption](#getpurchaseconsumption) | This endpoint can be called for consumption notifications (e.g. every 1 hour or when the user clicks a button). It returns the data balance (consumption) of purchased packages.                                                                                                                                       |

#### **listPurchases**

This endpoint can be used to list all the successful purchases made between a given interval.

- HTTP Method: `GET`
- Endpoint: `/purchases`

**Parameters**

| Name              | Type                    | Required | Description               |
| :---------------- | :---------------------- | :------: | :------------------------ |
| requestParameters | ListPurchasesParameters |    ❌    | Request Parameters Object |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.purchases.ListPurchasesOkResponse;
import io.github.saerelmasri.celitech.services.purchases.ListPurchasesParameters;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    ListPurchasesOkResponse response = celitech.purchasesService.listPurchases();

    System.out.println(response);
  }
}

```

#### **createPurchase**

This endpoint is used to purchase a new eSIM by providing the package details.

- HTTP Method: `POST`
- Endpoint: `/purchases`

**Parameters**

| Name                  | Type                  | Required | Description  |
| :-------------------- | :-------------------- | :------: | :----------- |
| createPurchaseRequest | CreatePurchaseRequest |    ✅    | Request Body |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.purchases.CreatePurchaseOkResponse;
import io.github.saerelmasri.celitech.services.purchases.CreatePurchaseRequest;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    CreatePurchaseRequest createPurchaseRequest = CreatePurchaseRequest
      .builder()
      .destination("FRA")
      .dataLimitInGb(1)
      .startDate("2023-11-01")
      .endDate("2023-11-20")
      .build();

    CreatePurchaseOkResponse response = celitech.purchasesService.createPurchase(createPurchaseRequest);

    System.out.println(response);
  }
}

```

#### **topUpEsim**

This endpoint is used to top-up an eSIM with the previously associated destination by providing an existing ICCID and the package details. The top-up is not feasible for eSIMs in "DELETED" or "ERROR" state.

- HTTP Method: `POST`
- Endpoint: `/purchases/topup`

**Parameters**

| Name             | Type             | Required | Description  |
| :--------------- | :--------------- | :------: | :----------- |
| topUpEsimRequest | TopUpEsimRequest |    ✅    | Request Body |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.purchases.TopUpEsimOkResponse;
import io.github.saerelmasri.celitech.services.purchases.TopUpEsimRequest;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    TopUpEsimRequest topUpEsimRequest = TopUpEsimRequest
      .builder()
      .iccid("1111222233334444555")
      .dataLimitInGb(1)
      .startDate("2023-11-01")
      .endDate("2023-11-20")
      .build();

    TopUpEsimOkResponse response = celitech.purchasesService.topUpEsim(topUpEsimRequest);

    System.out.println(response);
  }
}

```

#### **editPurchase**

This endpoint allows you to modify the dates of an existing package with a future activation start time. Editing can only be performed for packages that have not been activated, and it cannot change the package size. The modification must not change the package duration category to ensure pricing consistency.

- HTTP Method: `POST`
- Endpoint: `/purchases/edit`

**Parameters**

| Name                | Type                | Required | Description  |
| :------------------ | :------------------ | :------: | :----------- |
| editPurchaseRequest | EditPurchaseRequest |    ✅    | Request Body |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.purchases.EditPurchaseOkResponse;
import io.github.saerelmasri.celitech.services.purchases.EditPurchaseRequest;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
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

#### **getPurchaseConsumption**

This endpoint can be called for consumption notifications (e.g. every 1 hour or when the user clicks a button). It returns the data balance (consumption) of purchased packages.

- HTTP Method: `GET`
- Endpoint: `/purchases/{purchaseId}/consumption`

**Parameters**

| Name       | Type   | Required | Description        |
| :--------- | :----- | :------: | :----------------- |
| purchaseId | String |    ✅    | ID of the purchase |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.purchases.GetPurchaseConsumptionOkResponse;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    GetPurchaseConsumptionOkResponse response = celitech.purchasesService.getPurchaseConsumption(
      "4973fa15-6979-4daa-9cf3-672620df819c"
    );

    System.out.println(response);
  }
}

```

### ESimService

A list of all methods in the `ESimService` service. Click on the method name to view detailed information about that method.

| Methods                           | Description                            |
| :-------------------------------- | :------------------------------------- |
| [getEsim](#getesim)               | Get status from eSIM                   |
| [getEsimDevice](#getesimdevice)   | Get device info from an installed eSIM |
| [getEsimHistory](#getesimhistory) | Get history from an eSIM               |
| [getEsimMac](#getesimmac)         | Get MAC from eSIM                      |

#### **getEsim**

Get status from eSIM

- HTTP Method: `GET`
- Endpoint: `/esim`

**Parameters**

| Name              | Type              | Required | Description               |
| :---------------- | :---------------- | :------: | :------------------------ |
| requestParameters | GetEsimParameters |    ✅    | Request Parameters Object |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.esim.GetEsimOkResponse;
import io.github.saerelmasri.celitech.services.esim.GetEsimParameters;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    GetEsimParameters requestParameters = GetEsimParameters.builder().iccid("1111222233334444555").build();

    GetEsimOkResponse response = celitech.eSimService.getEsim(requestParameters);

    System.out.println(response);
  }
}

```

#### **getEsimDevice**

Get device info from an installed eSIM

- HTTP Method: `GET`
- Endpoint: `/esim/{iccid}/device`

**Parameters**

| Name  | Type   | Required | Description    |
| :---- | :----- | :------: | :------------- |
| iccid | String |    ✅    | ID of the eSIM |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.esim.GetEsimDeviceOkResponse;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    GetEsimDeviceOkResponse response = celitech.eSimService.getEsimDevice("1111222233334444555");

    System.out.println(response);
  }
}

```

#### **getEsimHistory**

Get history from an eSIM

- HTTP Method: `GET`
- Endpoint: `/esim/{iccid}/history`

**Parameters**

| Name  | Type   | Required | Description    |
| :---- | :----- | :------: | :------------- |
| iccid | String |    ✅    | ID of the eSIM |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.esim.GetEsimHistoryOkResponse;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    GetEsimHistoryOkResponse response = celitech.eSimService.getEsimHistory("1111222233334444555");

    System.out.println(response);
  }
}

```

#### **getEsimMac**

Get MAC from eSIM

- HTTP Method: `GET`
- Endpoint: `/esim/{iccid}/mac`

**Parameters**

| Name  | Type   | Required | Description    |
| :---- | :----- | :------: | :------------- |
| iccid | String |    ✅    | ID of the eSIM |

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.services.esim.GetEsimMacOkResponse;
import lombok.NonNull;

class Main {

  public static void main(String[] args) {
    Celitech celitech = new Celitech(config);

    GetEsimMacOkResponse response = celitech.eSimService.getEsimMac("1111222233334444555");

    System.out.println(response);
  }
}

```
