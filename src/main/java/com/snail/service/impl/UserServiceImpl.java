package com.snail.service.impl;

import com.snail.Mapper.UserMapper;
import com.snail.domain.User;
import com.snail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {
//        return userMapper.insert(user.getName(), user.getPassword(), user.getPhone());
        return userMapper.insert(user);
    }
}
