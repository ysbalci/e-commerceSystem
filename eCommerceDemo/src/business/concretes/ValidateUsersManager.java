package business.concretes;

import business.abstracts.ValidateUsersService;
import entities.concretes.Users;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsersManager implements ValidateUsersService {
    @Override
    public boolean checkFirstName(Users users) {
        if(users.getFirstName().length()<=2){
            System.out.println("İsim bilgisi 2 karakterden kısa olamaz");
            return false;
        }else{
            return true;
        }
    }
    @Override
    public boolean checkLastName(Users users) {
        if(users.getLastName().length()<=2){
            System.out.println("Soyisim bilgisi 2 karakterden az olamaz");
            return false;

        }else {
            return true;

        }
    }


    @Override
    public boolean checkPassword(Users users) {
        if (checkFirstName(users)&&checkLastName(users)){
            if(users.getPassword().length()<6){
                System.out.println("Parola en az 6 karakterden oluşmalıdır");
                return false;
            }else{
                return true;
            }
        }else {
            return false;
        }
    }

    @Override
    public boolean checkEmail(Users users) {
        String emailPatter= "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern =  Pattern.compile(emailPatter);
        Matcher matcher = pattern.matcher(users.getEmail());
        if(checkPassword(users)){
            if(!matcher.find()){
                System.out.println("Email uygun formatta değil..");
                return false;
            }else {
                return true;
            }
        }else {
            return false;
        }

    }
    @Override
    public boolean verificationEmail() {
        // Doğrulama linki için
        return true;
    }

}
