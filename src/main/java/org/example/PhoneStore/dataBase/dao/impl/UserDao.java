package org.example.PhoneStore.dataBase.dao.impl;


import org.example.PhoneStore.dataBase.models.User;

import java.util.List;

public interface UserDao {
    User findById(int id);
    User findByUsername(String username);
    void save(User user);
    void update(User user);
    void delete(User user);
    List<User> findAll();
    void deleteAll();
    boolean isExist(User user);
}
