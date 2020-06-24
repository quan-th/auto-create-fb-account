package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Address {

    @JsonProperty("type")
    String type = "work";

    @JsonProperty("customType")
    String customType;

    @JsonProperty("streetAddress")
    String streetAddress;

    @JsonProperty("locality")
    String locality;

    @JsonProperty("region")
    String region = "VN";

    @JsonProperty("postalCode")
    String postalCode = "100000";
}
