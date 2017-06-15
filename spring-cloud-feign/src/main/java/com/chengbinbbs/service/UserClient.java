package com.chengbinbbs.service;

import com.chengbinbbs.fallback.UserClientHystrix;
import com.chengbinbbs.module.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient("user-service")注解来绑定该接口对应user-service服务
 * @author zhangcb
 * @created on 2017/5/24.
 */
@FeignClient(value = "user-service",fallback = UserClientHystrix.class)
public interface UserClient {

    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    User addUser(@RequestParam(value = "name") String name, @RequestParam(value = "age") Integer age);
}
