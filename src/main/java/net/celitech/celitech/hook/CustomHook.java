package net.celitech.celitech.hook;

import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;

public class CustomHook implements Hook {

  @Override
  public Request beforeRequest(Request request, Map<String, String> additionalParameters) {
    return request;
  }

  @Override
  public Response afterResponse(Request request, Response response, Map<String, String> additionalParameters) {
    return response;
  }

  @Override
  public void onError(Request request, Exception exception, Map<String, String> additionalParameters) {}
}
