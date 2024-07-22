# ListPurchasesOkResponse

**Properties**

| Name        | Type            | Required | Description                                                                                                                                                                                                                                                                                     |
| :---------- | :-------------- | :------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| purchases   | List<Purchases> | ❌       |                                                                                                                                                                                                                                                                                                 |
| afterCursor | String          | ❌       | The cursor value representing the end of the current page of results. Use this cursor value as the "afterCursor" parameter in your next request to retrieve the subsequent page of results. It ensures that you continue fetching data from where you left off, facilitating smooth pagination. |
