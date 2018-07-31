

package com.myProject.service.impl;

import com.myProject.bean.user;
import com.myProject.Dao.userDao;
import com.myProject.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements userService {
    @Autowired
    userDao userDao;

    public List<user> getAll() {
        return userDao.getAll();
    }

    public user getLogin(String name, String password) {
        return userDao.getLogin(name, password);
    }
}