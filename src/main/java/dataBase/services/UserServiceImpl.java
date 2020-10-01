package dataBase.services;

import dataBase.dao.UserDaoImpl;
import dataBase.models.User;
import dataBase.services.impl.UserService;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDaoImpl usersDao = new UserDaoImpl();

    public UserServiceImpl() {
    }

    @Override
    public User findUser(int id) {
        return usersDao.findById(id);
    }

    @Override
    public User findUser(String username) {
        return usersDao.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        usersDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    @Override
    public void updateUser(User user) {
        usersDao.update(user);
    }

    @Override
    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    @Override
    public void deleteAllUsers() {
        usersDao.deleteAll();
    }
}
