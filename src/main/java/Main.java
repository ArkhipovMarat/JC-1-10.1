import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static final String REMOTE_SERVICE_URI = "https://cat-fact.herokuapp.com/facts";
    public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(REMOTE_SERVICE_URI);
        CloseableHttpResponse response = httpClient.execute(request);

        String jsonCatFactList = mapper.readTree(response.getEntity().getContent()).get("all").toString();

        Gson gson = new Gson();
        CatFact[] catFactList = gson.fromJson(jsonCatFactList,CatFact[].class);

        long count = Arrays.stream(catFactList).filter(value -> value.getUpvotes() != null && value.getUpvotes() > 0).count();
        System.out.println(count);
    }
}
