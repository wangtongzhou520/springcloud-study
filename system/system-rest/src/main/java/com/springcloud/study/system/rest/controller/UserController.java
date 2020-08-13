package com.springcloud.study.system.rest.controller;

import com.springcloud.study.common.core.vo.CommonResponse;
import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.service.user.SysUserService;
import com.springcloud.study.system.rest.convert.dept.SysUserRequestConvert;
import com.springcloud.study.system.rest.request.user.SaveUserRequest;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关接口
 *
 * @author wangtongzhou
 * @since 2020-08-13 18:49
 */
@RestController
@RequestMapping("/sys/user")
@Api("部门信息")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 保存用户信息
     *
     * @param saveUserRequest saveUserRequest
     * @return true or false
     */
    public CommonResponse<?> saveUser(@RequestBody @Validated SaveUserRequest saveUserRequest) {
        SaveUserDTO saveUserDTO =
                SysUserRequestConvert.INSTANCE.convert(saveUserRequest);
        sysUserService.saveUser(saveUserDTO);
        return CommonResponse.ok();
    }
}
