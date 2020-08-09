package com.springcloud.study.system.rest.convert.dept;

import com.springcloud.study.system.biz.dto.dept.SaveDeptDTO;
import com.springcloud.study.system.rest.request.dept.SaveDeptRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * dept convert dto
 *
 * @author wangtongzhou
 * @since 2020-06-15 21:21
 */
@Mapper
public interface SysDeptUserConvert {

    SysDeptUserConvert INSTANCE = Mappers.getMapper(SysDeptUserConvert.class);

    /**
     * saveDeptRequest convert saveDeptDTO
     *
     * @param saveDeptRequest saveDeptRequest
     * @return saveDeptDTO
     */
    @Mappings({})
    SaveDeptDTO convert(SaveDeptRequest saveDeptRequest);
}
