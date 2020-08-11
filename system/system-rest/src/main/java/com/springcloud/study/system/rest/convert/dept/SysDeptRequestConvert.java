package com.springcloud.study.system.rest.convert.dept;

import com.springcloud.study.system.biz.bo.dept.DeptTreeBO;
import com.springcloud.study.system.biz.dto.dept.SaveDeptDTO;
import com.springcloud.study.system.biz.dto.dept.UpdateDeptDTO;
import com.springcloud.study.system.rest.request.dept.SaveDeptRequest;
import com.springcloud.study.system.rest.request.dept.UpdateDeptRequest;
import com.springcloud.study.system.rest.vo.dept.DeptTreeVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * dept convert dto
 *
 * @author wangtongzhou
 * @since 2020-06-15 21:21
 */
@Mapper
public interface SysDeptRequestConvert {

    SysDeptRequestConvert INSTANCE = Mappers.getMapper(SysDeptRequestConvert.class);

    /**
     * saveDeptRequest convert saveDeptDTO
     *
     * @param saveDeptRequest saveDeptRequest
     * @return saveDeptDTO
     */
    @Mappings({})
    SaveDeptDTO convert(SaveDeptRequest saveDeptRequest);

    /**
     * updateDeptRequest convert updateDeptDTO
     *
     * @param updateDeptRequest updateDeptRequest
     * @return updateDeptDTO
     */
    @Mappings({})
    UpdateDeptDTO convert(UpdateDeptRequest updateDeptRequest);

    /**
     * deptTreeBO convert deptTreeVO
     *
     * @param deptTreeBo deptTreeBo
     * @return deptTreeVO
     */
    @Mappings({})
    DeptTreeVO convert(DeptTreeBO deptTreeBo);

    /**
     * deptTreeBoList convert  deptTreeVoList
     *
     * @param deptTreeBoList deptTreeBoList
     * @return deptTreeVoList
     */
    List<DeptTreeVO> convert(List<DeptTreeBO> deptTreeBoList);
}
