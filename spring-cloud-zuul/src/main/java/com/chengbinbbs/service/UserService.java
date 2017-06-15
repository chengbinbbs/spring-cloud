package com.chengbinbbs.service;

import com.chengbinbbs.entity.UserEntity;

/**
 * @author zhangcb
 * @created on 2017/6/15.
 */
public interface UserService {

    /**
     * 添加新用户
     *
     * username 唯一， 默认 USER 权限
     */
    boolean insert(UserEntity userEntity);

    /**
     * 查询用户信息
     * @param username 账号
     * @return UserEntity
     */
    UserEntity getByUsername(String username);

}
