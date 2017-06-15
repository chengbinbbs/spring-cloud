package com.chengbinbbs.controller;

import com.chengbinbbs.module.User;
import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 控制器
 *
 * @author zhangcb
 * @created 2017-05-24 11:40.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    private static Map<String, User> users = Maps.newConcurrentMap();

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public User addUser(@RequestParam(value = "name") String name,@RequestParam(value = "age")Integer age){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/addUser,host:" + instance.getHost() + ",port:" + instance.getPort() +",serviceId:" + instance.getServiceId());
        User user = new User(name,age);
        users.put(name,user);
        return user;
    }
}
