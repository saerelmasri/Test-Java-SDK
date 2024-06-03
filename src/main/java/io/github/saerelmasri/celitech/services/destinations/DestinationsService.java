package io.github.saerelmasri.celitech.services.destinations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.saerelmasri.celitech.exceptions.ApiException;
import io.github.saerelmasri.celitech.http.HttpMethod;
import io.github.saerelmasri.celitech.http.ModelConverter;
import io.github.saerelmasri.celitech.http.util.RequestBuilder;
import io.github.saerelmasri.celitech.services.BaseService;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * DestinationsService Service
 */
public class DestinationsService extends BaseService {

  public DestinationsService(@NonNull OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * List Destinations
   *
   * @return response of {@code ListDestinationsOkResponse}
   */
  public ListDestinationsOkResponse listDestinations() throws ApiException {
    Request request = this.buildListDestinationsRequest();
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<ListDestinationsOkResponse>() {});
  }

  /**
   * List Destinations
   *
   * @return response of {@code ListDestinationsOkResponse}
   */
  public CompletableFuture<ListDestinationsOkResponse> listDestinationsAsync() throws ApiException {
    Request request = this.buildListDestinationsRequest();
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res ->
      ModelConverter.convert(res, new TypeReference<ListDestinationsOkResponse>() {})
    );
  }

  private Request buildListDestinationsRequest() {
    return new RequestBuilder(HttpMethod.GET, this.serverUrl, "destinations").build();
  }
}
