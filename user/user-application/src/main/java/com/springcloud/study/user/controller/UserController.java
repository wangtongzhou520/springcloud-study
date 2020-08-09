package com.springcloud.study.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关接口
 *
 * @author wangtongzhou
 * @since 2020-05-24 22:23
 */
@RestController
@Api(tags = "用户相关服务")
public class UserController {

    @GetMapping("/user")
    @ApiOperation("查询用户信息")
    public String queryUser() {
        return "wtz";
    }
}
