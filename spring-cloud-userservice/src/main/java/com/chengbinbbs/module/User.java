package com.chengbinbbs.module;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author zhangcb
 * @created 2017-05-24 11:47.
 */
@Data
public class User implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
