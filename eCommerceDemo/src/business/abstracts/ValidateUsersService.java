package business.abstracts;

import entities.concretes.Users;

public interface ValidateUsersService {
    boolean checkPassword(Users users);
    boolean checkEmail(Users users);
    boolean checkFirstName(Users users);
    boolean checkLastName(Users users);

    boolean verificationEmail();

}
