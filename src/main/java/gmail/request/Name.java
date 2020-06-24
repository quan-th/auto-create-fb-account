package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Name {

    @JsonProperty("givenName")
    String givenName;

    @JsonProperty("familyName")
    String familyName;
}
