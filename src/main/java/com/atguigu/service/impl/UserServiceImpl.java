package com.atguigu.service.impl;


import com.atguigu.dao.UserDao;
import com.atguigu.entities.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findById(id).get();
    }

    @Override
    public void saveUser(User user) { // user 对象一定没有id ,就会做添加
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) { // user 对象一定有id  , 就会做更新
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }
}
