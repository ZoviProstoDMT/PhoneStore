package PhoneStore.dataBase.services.impl;

import PhoneStore.dataBase.models.User;
import java.util.List;

public interface UserService {
    User findUser(int id);
    User findUser(String username);
    void saveUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> findAllUsers();
    void deleteAllUsers();
}
