import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ExchangeRateApi {

    private static final String CHAVE_API = "65d96f792f990b31448165e4";
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";

    private OkHttpClient client;
    private Gson gson;

    public ExchangeRateApi() {
        client = new OkHttpClient();
        gson = new Gson();
    }

    public double getTaxaConversao(String fromMoeda, String toMoeda) throws IOException {
        String url = URL_BASE + CHAVE_API + "/latest/" + fromMoeda;
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("CHAVE INVÁLIDA! " + response);

            String responseData = response.body().string();
            RespostaAPI taxaConversao = gson.fromJson(responseData, RespostaAPI.class);
            return taxaConversao.getTaxaConversao().get(toMoeda);
        }
    }
}

