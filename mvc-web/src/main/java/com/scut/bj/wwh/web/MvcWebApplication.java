package com.scut.bj.wwh.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangwenhao06@meituan.com
 * @create 2020-05-05 下午4:48
 **/
@SpringBootApplication
@MapperScan("com.scut.bj.wwh.web.dao")
public class MvcWebApplication {
    public static void main(String[] args) {
        // 配置 MapperScan 扫描 不配置就会找不到 对应的mybatis mapper
        SpringApplication.run(MvcWebApplication.class, args);
    }
}
