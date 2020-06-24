package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Email {

    @JsonProperty("address")
    String address;

    @JsonProperty("type")
    String type = "home";

    @JsonProperty("customType")
    String customType;

    @JsonProperty("primary")
    boolean primary = true;
}
