package com.abnamro.assessment;


import com.abnamro.assessment.client.PersonHTTPClient;
import java.io.IOException;
import javax.inject.Inject;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PersonCLITool {

  public static void main(String[] args) {

    System.out.println(saveAndRetrievePersons(args));

  }

  private static String saveAndRetrievePersons(String[] args) {

    OkHttpClient client = new OkHttpClient();

    String json = "{\"name\":\"" + args[0] + "\",\"birthDate\":\"" + args[1] + "\"}";
    System.out.println(json);

    RequestBody body = RequestBody.create(
        MediaType.parse("application/json"), json);

    Request request = new Request.Builder()
        .url("http://localhost:8080/persons")
        .post(body)
        .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    } catch (IOException exception) {
      return "Something went wrong...";
    }
  }

}
