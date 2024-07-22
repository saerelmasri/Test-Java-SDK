# ESimService

A list of all methods in the `ESimService` service. Click on the method name to view detailed information about that method.

| Methods                           | Description      |
| :-------------------------------- | :--------------- |
| [getEsim](#getesim)               | Get eSIM Status  |
| [getEsimDevice](#getesimdevice)   | Get eSIM Device  |
| [getEsimHistory](#getesimhistory) | Get eSIM History |
| [getEsimMac](#getesimmac)         | Get eSIM MAC     |

## getEsim

Get eSIM Status

- HTTP Method: `GET`
- Endpoint: `/esim`

**Parameters**

| Name              | Type                                                | Required | Description               |
| :---------------- | :-------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [GetEsimParameters](../models/GetEsimParameters.md) | ✅       | Request Parameters Object |

**Return Type**

`GetEsimOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.GetEsimOkResponse;
import io.github.saerelmasri.celitech.models.GetEsimParameters;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    GetEsimParameters requestParameters = GetEsimParameters.builder().iccid("1111222233334444555").build();

    GetEsimOkResponse response = celitech.eSimService.getEsim(requestParameters);

    System.out.println(response);
  }
}

```

## getEsimDevice

Get eSIM Device

- HTTP Method: `GET`
- Endpoint: `/esim/{iccid}/device`

**Parameters**

| Name  | Type   | Required | Description    |
| :---- | :----- | :------- | :------------- |
| iccid | String | ✅       | ID of the eSIM |

**Return Type**

`GetEsimDeviceOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.GetEsimDeviceOkResponse;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    GetEsimDeviceOkResponse response = celitech.eSimService.getEsimDevice("1111222233334444555");

    System.out.println(response);
  }
}

```

## getEsimHistory

Get eSIM History

- HTTP Method: `GET`
- Endpoint: `/esim/{iccid}/history`

**Parameters**

| Name  | Type   | Required | Description    |
| :---- | :----- | :------- | :------------- |
| iccid | String | ✅       | ID of the eSIM |

**Return Type**

`GetEsimHistoryOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.GetEsimHistoryOkResponse;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    GetEsimHistoryOkResponse response = celitech.eSimService.getEsimHistory("1111222233334444555");

    System.out.println(response);
  }
}

```

## getEsimMac

Get eSIM MAC

- HTTP Method: `GET`
- Endpoint: `/esim/{iccid}/mac`

**Parameters**

| Name  | Type   | Required | Description    |
| :---- | :----- | :------- | :------------- |
| iccid | String | ✅       | ID of the eSIM |

**Return Type**

`GetEsimMacOkResponse`

**Example Usage Code Snippet**

```java
import io.github.saerelmasri.celitech.Celitech;
import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.models.GetEsimMacOkResponse;

public class Main {

  public static void main(String[] args) {
    CelitechConfig config = CelitechConfig.builder().clientId("client-id").clientSecret("client-secret").build();

    Celitech celitech = new Celitech(config);

    GetEsimMacOkResponse response = celitech.eSimService.getEsimMac("1111222233334444555");

    System.out.println(response);
  }
}

```
