import gmail.ClientGmail;
import gmail.request.RegisterGmailRequest;

public class Main {

    public static void main(String[] args) {
        RegisterGmailRequest request = new RegisterGmailRequest();
        String response = ClientGmail.createAccount(request);
        System.out.println("response: " + response);
    }
}
