package com.chengbinbbs.entity;

/**
 * @author zhangcb
 * @created 2017-06-15 9:44.
 */
import lombok.Data;

@Data
public class UserEntity {

    private Long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 权限
     */
    private String roles;
}
