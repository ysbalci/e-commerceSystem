package business.abstracts;

import entities.concretes.Users;

import java.util.List;

public interface UsersService {
    void register(Users user);
    void registerWithGoogle(String email);
    void login(Users users,String email, String password);


}
