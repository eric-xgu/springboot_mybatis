package com.ringo.service;


import com.ringo.dao.UserDao;
import com.ringo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Autowired(required = false)
    private UserDao userDao;

    public User queryUserByUsername(String name){
        return userDao.QueryUserByName(name);
    }
}
