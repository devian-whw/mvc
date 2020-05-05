package com.scut.bj.wwh.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangwenhao06@meituan.com
 * @create 2020-05-05 下午4:48
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(value = "com.scut.bj.wwh.web")
public class MvcWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MvcWebApplication.class, args);
    }
}
