
package com.myProject.service;

import com.myProject.bean.user;

import java.util.List;

public interface userService {
    List<user> getAll();

    user getLogin(String name, String password);
}
