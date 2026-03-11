package org.spring.service;

import org.spring.dao.UserDao;
import org.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int registerUser(User user) {
        int i = userDao.saveUser(user);
        return i;
    }
}
