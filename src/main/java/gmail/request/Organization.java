package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Organization {
    @JsonProperty("name")
    String name;

    @JsonProperty("title")
    String title;

    @JsonProperty("primary")
    boolean primary = true;

    @JsonProperty("work")
    String work;

    @JsonProperty("description")
    String description;
}
