package com.springcloud.study.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户操作的应用
 *
 * @author wangtongzhou
 * @since 2020-05-23 15:23
 */
@SpringBootApplication(scanBasePackages = {"com.springcloud.study"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
