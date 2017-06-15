package com.chengbinbbs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author zhangcb
 * @created 2017-05-24 16:25.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/foo")
    public String from(){
        return foo;
    }
}
