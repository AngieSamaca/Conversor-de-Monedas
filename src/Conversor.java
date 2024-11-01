import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

      public Moneda convertirMonedas(String base_code, String target_code, double valor) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/aa9ff7d4fdb131aa464a8ca9/pair/" +
                base_code + "/" + target_code + "/" + valor);

        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        } catch (InterruptedException e){
            System.out.println("La solicitud fue interrupida");
        } catch (IOException e){
            System.out.println("Error de salida: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Error inesperado al obtener la conversion: "+e.getMessage());
        }
        return null;
      }
}
