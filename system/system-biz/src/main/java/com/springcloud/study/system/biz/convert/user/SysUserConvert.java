package com.springcloud.study.system.biz.convert.user;

import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.dto.user.UpdateUserDTO;
import com.springcloud.study.system.biz.entity.user.SysUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * user dto covert do
 *
 * @author wangtongzhou
 * @since 2020-08-13 22:00
 */
@Mapper
public interface SysUserConvert {

    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);


    /**
     * saveUserDTO convert sysUserDO
     *
     * @param saveUserDTO saveUserDTO
     * @return sysUserDO
     */
    SysUserDO convert(SaveUserDTO saveUserDTO);


    /**
     * updateUserDTO convert sysUserDO
     *
     * @param updateUserDTO updateUserDTO
     * @return sysUserDO
     */
    SysUserDO convert(UpdateUserDTO updateUserDTO);
}
