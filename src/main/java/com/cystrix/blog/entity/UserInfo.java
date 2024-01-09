package com.cystrix.blog.entity;

import com.cystrix.blog.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: chenyue7@foxmail.com
 * @date: 10/7/2023
 * @description:
 */
@Getter
@Setter
public class UserInfo extends BaseEntity {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String nickname;
    private String avatar;
    private String motto;
}
