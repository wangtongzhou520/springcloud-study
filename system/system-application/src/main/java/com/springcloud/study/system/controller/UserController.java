package com.springcloud.study.system.controller;

import com.google.common.collect.Lists;
import com.springcloud.study.common.core.exception.BusinessException;
import com.springcloud.study.common.core.util.MD5Util;
import com.springcloud.study.common.core.vo.CommonResponse;
import com.springcloud.study.common.core.vo.PageParam;
import com.springcloud.study.common.core.vo.PageResponse;
import com.springcloud.study.system.bo.user.SysUserBO;
import com.springcloud.study.system.constant.SysUserStateEnum;
import com.springcloud.study.system.convert.user.SysUserConvert;
import com.springcloud.study.system.dto.user.SaveUserDTO;
import com.springcloud.study.system.dto.user.UpdateUserDTO;
import com.springcloud.study.system.service.user.SysUserService;
import com.springcloud.study.system.vo.user.SysUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
     * @param saveUserDTO saveUserDTO
     * @return true or false
     */
    @PostMapping("/users")
    @ApiOperation("添加用户信息")
    public CommonResponse<?> saveUser(@RequestBody @Validated SaveUserDTO saveUserDTO) {
        sysUserService.saveUser(saveUserDTO);
        return CommonResponse.ok();
    }

    /**
     * 更新用户信息
     *
     * @param updateUserDTO updateUserDTO
     * @return true or false
     */
    @PutMapping("/users")
    @ApiOperation("添加用户信息")
    public CommonResponse<?> updateUser(@RequestBody @Validated UpdateUserDTO updateUserDTO) {
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
    @GetMapping("/users/{userName}/{passWord}")
    @ApiOperation("登录")
    public CommonResponse<?> login(@PathVariable("userName") String userName,
                                   @PathVariable("passWord") String passWord) {
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

    /**
     * 登出
     *
     * @param userName 用户名
     * @return
     */
    @GetMapping("/users/{userName}")
    @ApiOperation("登录")
    public CommonResponse<?> loginOut(@PathVariable("userName") String userName) {
        return CommonResponse.ok();
    }

    /**
     * 分页查询用户信息
     *
     * @param deptId    deptId
     * @param pageParam 分页参数
     * @return 分页用户信息
     */
    @GetMapping("/users/{deptId}/{pageParam}")
    public CommonResponse<PageResponse<SysUserVO>> queryPage(@PathVariable String deptId,
                                                             @PathVariable PageParam pageParam) {
        int total = sysUserService.countSysUsersByDeptId(deptId);
        List<SysUserVO> sysUserVOList = Lists.newArrayList();
        if (total > 0) {
            List<SysUserBO> sysUserBOList =
                    sysUserService.querySysUsersByDeptId(deptId, pageParam);
            sysUserVOList =
                    SysUserConvert.INSTANCE.convertVO(sysUserBOList);
        }
        PageResponse<SysUserVO> response =
                PageResponse.pageResponse(sysUserVOList, total);
        return CommonResponse.ok(response);
    }
}
