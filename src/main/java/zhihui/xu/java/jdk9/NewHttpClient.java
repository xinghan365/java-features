package zhihui.xu.java.jdk9;


import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class NewHttpClient {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req =
                HttpRequest.newBuilder(URI.create("http://www.google.com"))
                        .header("User-Agent","Java")
                        .GET()
                        .build();


        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
    }
}
