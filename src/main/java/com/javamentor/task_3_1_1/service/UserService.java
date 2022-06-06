package com.javamentor.task_3_1_1.service;

import com.javamentor.task_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(Long id);
    void addUser(User user);
    void deleteUser(Long id);
    void changeUser(User updateUser);
}
