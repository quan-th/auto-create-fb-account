package gmail.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RegisterGmailRequest {

    @JsonProperty("primaryEmail")
    String primaryEmail;

    @JsonProperty("name")
    Name name;

    @JsonProperty("suspended")
    boolean suspended;

    @JsonProperty("password")
    String password;

    @JsonProperty("hashFunction")
    String hashFunction = "SHA-1";

    @JsonProperty("changePasswordAtNextLogin")
    boolean changePasswordAtNextLogin;

    @JsonProperty("ipWhitelisted")
    boolean ipWhitelisted;

    @JsonProperty("ims")
    List<Im> ims;

    @JsonProperty("emails")
    List<Email> emails;

    @JsonProperty("addresses")
    List<Address> addresses;

    @JsonProperty("externalIds")
    List<ExternalId> externalIds;

    @JsonProperty("relations")
    List<Relation> relations;

    @JsonProperty("organizations")
    List<Organization> organizations;

    @JsonProperty("phones")
    List<Phone> phones;

    @JsonProperty("orgUnitPath")
    String orgUnitPath;

    @JsonProperty("includeInGlobalAddressList")
    boolean includeInGlobalAddressList = true;

    public RegisterGmailRequest(){
        primaryEmail = "thquan00000001@rubima.net";
        name = new Name("Quan", "Tran");
        password = "Qu@n4567";
    }
}
