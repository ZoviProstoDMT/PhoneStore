package PhoneStore.dataBase.services;

import PhoneStore.dataBase.dao.UserDaoImpl;
import PhoneStore.dataBase.models.User;
import PhoneStore.dataBase.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl usersDao;

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
