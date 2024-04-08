import business.concretes.UsersManager;
import business.concretes.ValidateUsersManager;
import core.concretes.GoogleManagerAdapter;
import entities.concretes.Users;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {

        Users users = new Users(1,"Yunus","Selim","12345678901","abc@abc.com","1234567");
        UsersManager manager = new UsersManager(new ValidateUsersManager());
        manager.register(users);
        manager.login(users,"abc@abc.com","1234567");


        //Google hesabı ile kayıt oluşturma
     //   UsersManager manager2 = new UsersManager(new GoogleManagerAdapter());
     //   manager2.registerWithGoogle("deneme@deneme.com");
    }
}