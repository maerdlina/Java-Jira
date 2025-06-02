package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dog-api.kinduff.com/api/facts"))
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // Ручной разбор JSON (только для демо, в реальных проектах используйте библиотеки!)
        String json = response.body();
        String fact = json.split("\"facts\":\\[\"")[1].split("\"\\]")[0];
        System.out.println("Факт о собаках: " + fact);
    }
}
