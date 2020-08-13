package com.springcloud.study.system.biz.service.user;

import com.springcloud.study.system.biz.dto.user.SaveUserDTO;

/**
 * 用户相关
 *
 * @author wangtongzhou
 * @since 2020-08-13 21:23
 */
public interface SysUserService {

    /**
     * 保存用户信息
     *
     * @param saveUserDTO saveUserDTO
     */
    void saveUser(SaveUserDTO saveUserDTO);
}
