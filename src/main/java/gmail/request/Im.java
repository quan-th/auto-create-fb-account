package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Im {

    @JsonProperty("type")
    String type = "work";

    @JsonProperty("protocol")
    String protocol = "gtalk";

    @JsonProperty("im")
    String im;

    @JsonProperty("primary")
    boolean primary = true;
}
