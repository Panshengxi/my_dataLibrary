
package com.myProject.controller;

import com.myProject.bean.user;
import com.myProject.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/blog")
public class userController {
    @Autowired
    userService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public Map<String, Object> getUser() {
        Map map = new HashMap();
        List<user> list = userService.getAll();
        map.put("user", list);
        map.put("status", 1);
        map.put("success", true);
        return map;
    }
    @RequestMapping("getLogin")
    @ResponseBody
    public Map<String, Object> getLogin(String name, String password) {
        Map map = new HashMap();
        user user = userService.getLogin(name, password);
        map.put("user", user);
        map.put("isLogin", true);
        map.put("status", 1);
        return map;
    }
}
