import java.io.IOException;

public class ConversorMoeda {

        private ExchangeRateApi API;

        public ConversorMoeda() {
            API = new ExchangeRateApi();
        }

        public double convert(String fromMoeda, String toMoeda, double amount) throws IOException {
            double taxaConversao = API.getTaxaConversao(fromMoeda, toMoeda);
            return amount * taxaConversao;
        }
    }


