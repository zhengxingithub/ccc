package com.tecode.service.impl;

import com.tecode.dao.UserDao;
import com.tecode.model.User;
import com.tecode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    UserDao userDao;
    @Override
    public User login(User user) {
        List<User> users = (List<User>) userDao.login(user);

if (users.size()>0){

    return users.get(0);
}else{
    return null;
}

    }
}
