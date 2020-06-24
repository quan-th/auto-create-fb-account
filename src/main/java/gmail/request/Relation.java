package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Relation {
    @JsonProperty("value")
    String value;

    @JsonProperty("type")
    String type;

    @JsonProperty("customType")
    String customType;
}
