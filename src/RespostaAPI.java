import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class RespostaAPI {

        @SerializedName("conversion_rates")
        private Map<String, Double> TaxaConversao;

        public Map<String, Double> getTaxaConversao() {
            return TaxaConversao;
        }

        public void setTaxaConversao(Map<String, Double> conversionRates) {
            this.TaxaConversao = conversionRates;
        }
    }


