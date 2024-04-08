package dataAccess.abstracts;

import entities.concretes.Users;

import java.util.List;

public interface UsersDao {
    Users getUser(Long id);
    List<Users> getAllUsers();
    void add(Users users);
    void delete(Users users);
    void update(Users users);
}
