package com.spring.boot.service;

import com.spring.boot.bean.User;

import java.util.List;

public interface UserService {
    public List<User> AllUser();
    public  int Update(User user);
    public  int add(User user);
    public  void deleteAll();
}
