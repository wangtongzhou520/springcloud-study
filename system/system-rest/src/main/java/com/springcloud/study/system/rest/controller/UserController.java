package com.springcloud.study.system.rest.controller;

import com.springcloud.study.common.core.exception.BusinessException;
import com.springcloud.study.common.core.util.MD5Util;
import com.springcloud.study.common.core.vo.CommonResponse;
import com.springcloud.study.system.biz.bo.user.SysUserBO;
import com.springcloud.study.system.biz.constant.SysUserStateEnum;
import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.dto.user.UpdateUserDTO;
import com.springcloud.study.system.biz.service.user.SysUserService;
import com.springcloud.study.system.rest.convert.dept.SysUserRequestConvert;
import com.springcloud.study.system.rest.request.user.SaveUserRequest;
import com.springcloud.study.system.rest.request.user.UpdateUserRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

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
    @PostMapping("/save")
    @ApiOperation("添加用户信息")
    public CommonResponse<?> saveUser(@RequestBody @Validated SaveUserRequest saveUserRequest) {
        SaveUserDTO saveUserDTO =
                SysUserRequestConvert.INSTANCE.convert(saveUserRequest);
        sysUserService.saveUser(saveUserDTO);
        return CommonResponse.ok();
    }

    /**
     * 更新用户信息
     *
     * @param updateUserRequest updateUserRequest
     * @return true or false
     */
    @PostMapping("/update")
    @ApiOperation("添加用户信息")
    public CommonResponse<?> updateUser(@RequestBody @Validated UpdateUserRequest updateUserRequest) {
        UpdateUserDTO updateUserDTO =
                SysUserRequestConvert.INSTANCE.convert(updateUserRequest);
        sysUserService.updateUser(updateUserDTO);
        return CommonResponse.ok();
    }

    /**
     * 登录
     *
     * @param userName userName
     * @param passWord passWord
     * @return true or false
     */
    @PostMapping("/login")
    @ApiOperation("登录")
    public CommonResponse<?> login(@RequestBody String userName,
                                   @RequestBody String passWord) {
        SysUserBO sysUserBO = sysUserService.querySysByUserName(userName);
        if (Objects.isNull(sysUserBO)) {
            throw new BusinessException("查询不到指定用户");
        } else if (!sysUserBO.getPassword().equals(MD5Util.encrypt(passWord))) {
            throw new BusinessException("用户名密码不正确");
        } else if (SysUserStateEnum.FROZEN.equals(sysUserBO.getStatus())) {
            throw new BusinessException("账户已经被冻结");
        } else {
            return CommonResponse.ok();
        }
    }
}
