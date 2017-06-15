package com.chengbinbbs.fallback;

import com.chengbinbbs.module.User;
import com.chengbinbbs.service.UserClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 回调类
 *
 * @author zhangcb
 * @created 2017-05-24 15:03.
 */
@Component
public class UserClientHystrix implements UserClient {
    @Override
    public User addUser(@RequestParam(value = "name") String name, @RequestParam(value = "age") Integer age) {
        return new User();
    }
}
