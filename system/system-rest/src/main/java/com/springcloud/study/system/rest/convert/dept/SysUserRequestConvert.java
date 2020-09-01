package com.springcloud.study.system.rest.convert.dept;

import com.springcloud.study.system.biz.bo.user.SysUserBO;
import com.springcloud.study.system.biz.dto.user.SaveUserDTO;
import com.springcloud.study.system.biz.dto.user.UpdateUserDTO;
import com.springcloud.study.system.rest.request.dept.UpdateDeptRequest;
import com.springcloud.study.system.rest.request.user.SaveUserRequest;
import com.springcloud.study.system.rest.request.user.UpdateUserRequest;
import com.springcloud.study.system.rest.vo.user.SysUserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

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
    @Mappings({})
    SaveUserDTO convert(SaveUserRequest saveUserRequest);

    /**
     * updateUserRequest request updateUserDTO
     *
     * @param updateUserRequest updateUserRequest
     * @return updateUserDTO
     */
    @Mappings({})
    UpdateUserDTO convert(UpdateUserRequest updateUserRequest);

    /**
     * sysUserBO convert sysUserVO
     *
     * @param sysUserBO sysUserBO
     * @return sysUserVO
     */
    @Mappings({})
    SysUserVO convert(SysUserBO sysUserBO);

    /**
     * sysUserBOList convert  sysUserVOList
     *
     * @param sysUserBOList sysUserVOList
     * @return sysUserVOListz
     */
    List<SysUserVO> convert(List<SysUserBO> sysUserBOList);

}
