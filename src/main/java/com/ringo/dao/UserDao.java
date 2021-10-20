package com.ringo.dao;

import com.ringo.vo.User;

public interface UserDao {
    public User QueryUserByName(String name);
}
