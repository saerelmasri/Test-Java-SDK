package io.github.saerelmasri.celitech.services;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.saerelmasri.celitech.exceptions.ApiException;
import io.github.saerelmasri.celitech.http.HttpMethod;
import io.github.saerelmasri.celitech.http.ModelConverter;
import io.github.saerelmasri.celitech.http.util.RequestBuilder;
import io.github.saerelmasri.celitech.models.ListPackagesOkResponse;
import io.github.saerelmasri.celitech.models.ListPackagesParameters;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * PackagesService Service
 */
public class PackagesService extends BaseService {

  public PackagesService(@NonNull OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * List Packages
   *
   * @param requestParameters {@link ListPackagesParameters} Request Parameters Object
   * @return response of {@code ListPackagesOkResponse}
   */
  public ListPackagesOkResponse listPackages(ListPackagesParameters requestParameters) throws ApiException {
    Request request = this.buildListPackagesRequest(requestParameters);
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<ListPackagesOkResponse>() {});
  }

  /**
   * List Packages
   *
   * @param requestParameters {@link ListPackagesParameters} Request Parameters Object
   * @return response of {@code ListPackagesOkResponse}
   */
  public CompletableFuture<ListPackagesOkResponse> listPackagesAsync(ListPackagesParameters requestParameters)
    throws ApiException {
    Request request = this.buildListPackagesRequest(requestParameters);
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res -> ModelConverter.convert(res, new TypeReference<ListPackagesOkResponse>() {}));
  }

  private Request buildListPackagesRequest(ListPackagesParameters requestParameters) {
    return new RequestBuilder(HttpMethod.GET, this.serverUrl, "packages")
      .setOptionalQueryParameter("destination", requestParameters.getDestination())
      .setOptionalQueryParameter("startDate", requestParameters.getStartDate())
      .setOptionalQueryParameter("endDate", requestParameters.getEndDate())
      .setOptionalQueryParameter("afterCursor", requestParameters.getAfterCursor())
      .setOptionalQueryParameter("limit", requestParameters.getLimit())
      .setOptionalQueryParameter("startTime", requestParameters.getStartTime())
      .setOptionalQueryParameter("endTime", requestParameters.getEndTime())
      .setOptionalQueryParameter("duration", requestParameters.getDuration())
      .build();
  }
}
