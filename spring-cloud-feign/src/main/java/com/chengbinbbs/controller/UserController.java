package com.chengbinbbs.controller;

import com.chengbinbbs.module.User;
import com.chengbinbbs.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author zhangcb
 * @created 2017-05-24 14:42.
 */
@RestController
public class UserController {

    @Autowired
    UserClient userClient;

    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    public User addUser(@RequestParam(value = "name")String name,@RequestParam("age")Integer age){
        return userClient.addUser(name,age);
    }
}
