package ru.def.learn.service;

import ru.def.learn.model.User;

import java.util.List;

public interface UserService {
    List<User> index ();
    void add(User user);
    void delete (int id);
    User id(int id);
    void update(User user);


}
