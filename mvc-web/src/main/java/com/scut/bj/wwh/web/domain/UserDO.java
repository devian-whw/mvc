package com.scut.bj.wwh.web.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserDO {
    private Long id;

    private String username;

    private String password;

    private Integer age;

    private Date ctime;

    private Date utime;
}