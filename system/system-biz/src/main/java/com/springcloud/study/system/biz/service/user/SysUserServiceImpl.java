package com.springcloud.study.system.biz.service.user;

import com.springcloud.study.common.core.exception.BusinessException;
import com.springcloud.study.common.core.util.MD5Util;
import com.springcloud.study.system.biz.convert.user.SysUserConvert;
import com.springcloud.study.system.biz.dao.user.SysUserMapper;
import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.entity.user.SysUserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户实现类
 *
 * @author wangtongzhou
 * @since 2020-08-13 21:31
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void saveUser(SaveUserDTO saveUserDTO) {
        if (checkTelephoneExist(saveUserDTO.getTelephone(),
                saveUserDTO.getUsername())) {
            throw new BusinessException("电话已被占用");
        }
        if (checkEmailExist(saveUserDTO.getMail(), saveUserDTO.getUsername())) {
            throw new BusinessException("邮箱已经被占用    ");
        }
        String encryptedPassword = MD5Util.encrypt("123456");
        SysUserDO sysUserDO = SysUserConvert.INSTANCE.convert(saveUserDTO);
        sysUserDO.setCreateOperator("")
                .setPassword(encryptedPassword)
                .setModifiedOperateIp("")
                .setModifiedOperator("")
                .setGmtCreate(new Date())
                .setGmtModified(new Date());
        sysUserMapper.insert(sysUserDO);
    }

    private boolean checkEmailExist(String mail, String username) {
        return false;
    }

    private boolean checkTelephoneExist(String telephone, String username) {
        return false;
    }
}