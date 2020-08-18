package com.springcloud.study.system.rest.convert.dept;

import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.dto.user.UpdateUserDTO;
import com.springcloud.study.system.rest.request.dept.UpdateDeptRequest;
import com.springcloud.study.system.rest.request.user.SaveUserRequest;
import com.springcloud.study.system.rest.request.user.UpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * user request convert dto
 *
 * @author wangtongzhou
 * @since 2020-08-13 21:13
 */
@Mapper
public interface SysUserRequestConvert {

    SysUserRequestConvert INSTANCE = Mappers.getMapper(SysUserRequestConvert.class);

    /**
     * saveUserRequest convert saveUserDTO
     *
     * @param saveUserRequest saveUserRequest
     * @return saveUserDTO
     */
    SaveUserDTO convert(SaveUserRequest saveUserRequest);

    /**
     * updateUserRequest request updateUserDTO
     *
     * @param updateUserRequest updateUserRequest
     * @return updateUserDTO
     */
    UpdateUserDTO convert(UpdateUserRequest updateUserRequest);

}
