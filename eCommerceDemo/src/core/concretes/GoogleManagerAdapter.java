package core.concretes;

import core.abstracts.GoogleServiceAdapter;
import google.GoogleManager;

public class GoogleManagerAdapter implements GoogleServiceAdapter {
    @Override
    public void registerGoogle(String email) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.registerGoogle(email);
        System.out.println("Mail adresinize doğrulama kodu gönderildi");
    }
}
