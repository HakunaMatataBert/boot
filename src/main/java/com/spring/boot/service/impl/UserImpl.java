package com.spring.boot.service.impl;

import com.spring.boot.bean.User;
import com.spring.boot.dao.UserDao;
import com.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> AllUser() {
        return userDao.AllUser();
    }

    @Override
    public int Update(User user) {
        return userDao.Update(user);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public void deleteAll() {
        userDao.deleteAll();
    }
}
