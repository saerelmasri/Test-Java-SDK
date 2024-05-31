package net.celitech.celitech.services.purchases;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import net.celitech.celitech.exceptions.ApiException;
import net.celitech.celitech.http.HttpMethod;
import net.celitech.celitech.http.ModelConverter;
import net.celitech.celitech.http.util.RequestBuilder;
import net.celitech.celitech.services.BaseService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * PurchasesService Service
 */
public class PurchasesService extends BaseService {

  public PurchasesService(@NonNull OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * List Purchases
   *
   * @param requestParameters {@link ListPurchasesParameters} Request Parameters Object
   * @return response of {@code ListPurchasesOkResponse}
   */
  public ListPurchasesOkResponse listPurchases(ListPurchasesParameters requestParameters) throws ApiException {
    Request request = this.buildListPurchasesRequest(requestParameters);
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<ListPurchasesOkResponse>() {});
  }

  /**
   * List Purchases
   *
   * @param requestParameters {@link ListPurchasesParameters} Request Parameters Object
   * @return response of {@code ListPurchasesOkResponse}
   */
  public CompletableFuture<ListPurchasesOkResponse> listPurchasesAsync(ListPurchasesParameters requestParameters)
    throws ApiException {
    Request request = this.buildListPurchasesRequest(requestParameters);
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res -> ModelConverter.convert(res, new TypeReference<ListPurchasesOkResponse>() {}));
  }

  private Request buildListPurchasesRequest(ListPurchasesParameters requestParameters) {
    return new RequestBuilder(HttpMethod.GET, this.serverUrl, "purchases")
      .setOptionalQueryParameter("iccid", requestParameters.getIccid())
      .setOptionalQueryParameter("afterDate", requestParameters.getAfterDate())
      .setOptionalQueryParameter("beforeDate", requestParameters.getBeforeDate())
      .setOptionalQueryParameter("afterCursor", requestParameters.getAfterCursor())
      .setOptionalQueryParameter("limit", requestParameters.getLimit())
      .setOptionalQueryParameter("after", requestParameters.getAfter())
      .setOptionalQueryParameter("before", requestParameters.getBefore())
      .build();
  }

  /**
   * Create Purchase
   *
   * @param createPurchaseRequest {@link CreatePurchaseRequest} Request Body
   * @return response of {@code CreatePurchaseOkResponse}
   */
  public CreatePurchaseOkResponse createPurchase(@NonNull CreatePurchaseRequest createPurchaseRequest)
    throws ApiException {
    Request request = this.buildCreatePurchaseRequest(createPurchaseRequest);
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<CreatePurchaseOkResponse>() {});
  }

  /**
   * Create Purchase
   *
   * @param createPurchaseRequest {@link CreatePurchaseRequest} Request Body
   * @return response of {@code CreatePurchaseOkResponse}
   */
  public CompletableFuture<CreatePurchaseOkResponse> createPurchaseAsync(
    @NonNull CreatePurchaseRequest createPurchaseRequest
  ) throws ApiException {
    Request request = this.buildCreatePurchaseRequest(createPurchaseRequest);
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res -> ModelConverter.convert(res, new TypeReference<CreatePurchaseOkResponse>() {})
    );
  }

  private Request buildCreatePurchaseRequest(@NonNull CreatePurchaseRequest createPurchaseRequest) {
    return new RequestBuilder(HttpMethod.POST, this.serverUrl, "purchases")
      .setJsonContent(createPurchaseRequest)
      .build();
  }

  /**
   * Top-up eSIM
   *
   * @param topUpEsimRequest {@link TopUpEsimRequest} Request Body
   * @return response of {@code TopUpEsimOkResponse}
   */
  public TopUpEsimOkResponse topUpEsim(@NonNull TopUpEsimRequest topUpEsimRequest) throws ApiException {
    Request request = this.buildTopUpEsimRequest(topUpEsimRequest);
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<TopUpEsimOkResponse>() {});
  }

  /**
   * Top-up eSIM
   *
   * @param topUpEsimRequest {@link TopUpEsimRequest} Request Body
   * @return response of {@code TopUpEsimOkResponse}
   */
  public CompletableFuture<TopUpEsimOkResponse> topUpEsimAsync(@NonNull TopUpEsimRequest topUpEsimRequest)
    throws ApiException {
    Request request = this.buildTopUpEsimRequest(topUpEsimRequest);
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res -> ModelConverter.convert(res, new TypeReference<TopUpEsimOkResponse>() {}));
  }

  private Request buildTopUpEsimRequest(@NonNull TopUpEsimRequest topUpEsimRequest) {
    return new RequestBuilder(HttpMethod.POST, this.serverUrl, "purchases/topup")
      .setJsonContent(topUpEsimRequest)
      .build();
  }

  /**
   * Edit Purchase
   *
   * @param editPurchaseRequest {@link EditPurchaseRequest} Request Body
   * @return response of {@code EditPurchaseOkResponse}
   */
  public EditPurchaseOkResponse editPurchase(@NonNull EditPurchaseRequest editPurchaseRequest) throws ApiException {
    Request request = this.buildEditPurchaseRequest(editPurchaseRequest);
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<EditPurchaseOkResponse>() {});
  }

  /**
   * Edit Purchase
   *
   * @param editPurchaseRequest {@link EditPurchaseRequest} Request Body
   * @return response of {@code EditPurchaseOkResponse}
   */
  public CompletableFuture<EditPurchaseOkResponse> editPurchaseAsync(@NonNull EditPurchaseRequest editPurchaseRequest)
    throws ApiException {
    Request request = this.buildEditPurchaseRequest(editPurchaseRequest);
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res -> ModelConverter.convert(res, new TypeReference<EditPurchaseOkResponse>() {}));
  }

  private Request buildEditPurchaseRequest(@NonNull EditPurchaseRequest editPurchaseRequest) {
    return new RequestBuilder(HttpMethod.POST, this.serverUrl, "purchases/edit")
      .setJsonContent(editPurchaseRequest)
      .build();
  }

  /**
   * Get Purchase Consumption
   *
   * @param purchaseId String ID of the purchase
   * @return response of {@code GetPurchaseConsumptionOkResponse}
   */
  public GetPurchaseConsumptionOkResponse getPurchaseConsumption(@NonNull String purchaseId) throws ApiException {
    Request request = this.buildGetPurchaseConsumptionRequest(purchaseId);
    Response response = this.execute(request);

    return ModelConverter.convert(response, new TypeReference<GetPurchaseConsumptionOkResponse>() {});
  }

  /**
   * Get Purchase Consumption
   *
   * @param purchaseId String ID of the purchase
   * @return response of {@code GetPurchaseConsumptionOkResponse}
   */
  public CompletableFuture<GetPurchaseConsumptionOkResponse> getPurchaseConsumptionAsync(@NonNull String purchaseId)
    throws ApiException {
    Request request = this.buildGetPurchaseConsumptionRequest(purchaseId);
    CompletableFuture<Response> response = this.executeAsync(request);

    return response.thenApplyAsync(res ->
      ModelConverter.convert(res, new TypeReference<GetPurchaseConsumptionOkResponse>() {})
    );
  }

  private Request buildGetPurchaseConsumptionRequest(@NonNull String purchaseId) {
    return new RequestBuilder(HttpMethod.GET, this.serverUrl, "purchases/{purchaseId}/consumption")
      .setPathParameter("purchaseId", purchaseId)
      .build();
  }
}
