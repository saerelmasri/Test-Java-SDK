package io.github.saerelmasri.celitech;

import io.github.saerelmasri.celitech.config.CelitechConfig;
import io.github.saerelmasri.celitech.http.Environment;
import io.github.saerelmasri.celitech.http.interceptors.DefaultHeadersInterceptor;
import io.github.saerelmasri.celitech.http.interceptors.RetryInterceptor;
import io.github.saerelmasri.celitech.services.destinations.DestinationsService;
import io.github.saerelmasri.celitech.services.esim.ESimService;
import io.github.saerelmasri.celitech.services.packages.PackagesService;
import io.github.saerelmasri.celitech.services.purchases.PurchasesService;
import okhttp3.OkHttpClient;

/** Welcome to the CELITECH API documentation!  Useful links: [Homepage](https://www.celitech.com) | [Support email](mailto:support@celitech.com) | [Blog](https://www.celitech.com/blog/)  */
public class Celitech {

  public final DestinationsService destinationsService;
  public final PackagesService packagesService;
  public final PurchasesService purchasesService;
  public final ESimService eSimService;

  public Celitech() {
    // Default configs
    this(CelitechConfig.builder().build());
  }

  public Celitech(CelitechConfig config) {
    final String serverUrl = config.getEnvironment().getUrl();

    final OkHttpClient httpClient = new OkHttpClient.Builder()
      .addInterceptor(new DefaultHeadersInterceptor(config))
      .addInterceptor(new RetryInterceptor(config.getRetryConfig()))
      .build();

    this.destinationsService = new DestinationsService(httpClient, serverUrl);
    this.packagesService = new PackagesService(httpClient, serverUrl);
    this.purchasesService = new PurchasesService(httpClient, serverUrl);
    this.eSimService = new ESimService(httpClient, serverUrl);
  }

  public void setEnvironment(Environment environment) {
    setBaseUrl(environment.getUrl());
  }

  public void setBaseUrl(String baseUrl) {
    this.destinationsService.setBaseUrl(baseUrl);
    this.packagesService.setBaseUrl(baseUrl);
    this.purchasesService.setBaseUrl(baseUrl);
    this.eSimService.setBaseUrl(baseUrl);
  }
}
// c029837e0e474b76bc487506e8799df5e3335891efe4fb02bda7a1441840310c
