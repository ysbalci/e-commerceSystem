package dataAccess.concretes;

import dataAccess.abstracts.UsersDao;
import entities.concretes.Users;

import java.util.List;

public class HibernateUsersDao implements UsersDao {

    //Veriye erişim kodları yazılacak!!!!!
    @Override
    public Users getUser(Long id) {
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return null;
    }

    @Override
    public void add(Users users) {
        System.out.println("Hibernate ile kullanıcı kaydı oluşturuldu");
    }

    @Override
    public void delete(Users users) {
        System.out.println("Hibernate ile kullanıcı kaydı silindi");
    }

    @Override
    public void update(Users users) {
        System.out.println("Hibernate ile kllanıcı kaydı güncellendi");
    }


}
