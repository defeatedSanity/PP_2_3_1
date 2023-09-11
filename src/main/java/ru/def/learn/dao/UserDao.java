package ru.def.learn.dao;

import ru.def.learn.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    void add(User user);
    void delete (int id);
    User id(int id);
    void update(User user);
}
