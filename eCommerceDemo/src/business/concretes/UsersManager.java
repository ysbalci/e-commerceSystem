package business.concretes;

import business.abstracts.UsersService;
import business.abstracts.ValidateUsersService;
import core.abstracts.GoogleServiceAdapter;
import entities.concretes.Users;


public class UsersManager implements UsersService {
    private ValidateUsersService validateUsersService;
    private GoogleServiceAdapter googleServiceAdapter;

    public UsersManager(ValidateUsersService validateUsersService) {
        this.validateUsersService = validateUsersService;

    }
    public UsersManager( GoogleServiceAdapter googleServiceAdapter){
        this.googleServiceAdapter= googleServiceAdapter;
    }

    @Override
    public void register(Users users) {
        if(this.validateUsersService.checkEmail(users)){
            System.out.println("Kaydınız başarılı bir şekilde tamamlandı");
            System.out.println("Üyeliğiniz aktif duruma geçebilmesi için mail adresinize gönderilen doğrulama linkine tıklayın");
        }else {
            System.out.println("kayıt gerçekleştirilemedi!!");
        }
    }

    @Override
    public void registerWithGoogle(String email) {
        this.googleServiceAdapter.registerGoogle(email);

    }


    @Override
    public void login(Users users,String email, String password) {
        if(users.getEmail()!=email||users.getPassword()!=password) {
            System.out.println("Email vey parola hatalı");
            return;
        }
        if (this.validateUsersService.verificationEmail()){
            System.out.println("Giriş işlemi başarılı");
        }


    }




}
