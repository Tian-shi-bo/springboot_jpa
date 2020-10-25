package com.atguigu.service;

import com.atguigu.entities.User;

import java.util.List;

/**
 * @author tian
 * @date 2020/10/22 13:29
 */
public interface UserService {
    List<User> findUsers();

    User findUserById(Integer id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer id);
}
