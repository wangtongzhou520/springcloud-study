package com.springcloud.study.system.biz.service.user;

import com.springcloud.study.system.biz.dto.dept.UpdateDeptDTO;
import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.dto.user.UpdateUserDTO;

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

    /**
     * 更新用户信息
     *
     * @param updateUserDTO updateUserDTO
     */
    void updateUser(UpdateUserDTO updateUserDTO);
}
