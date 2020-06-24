package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExternalId {
    @JsonProperty("value")
    String value = "12345";

    @JsonProperty("type")
    String type = "custom";

    @JsonProperty("customType")
    String customType = "employee";
}
