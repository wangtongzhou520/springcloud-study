package com.springcloud.study.system.biz.convert.dept;

import com.springcloud.study.system.biz.bo.dept.DeptTreeBO;
import com.springcloud.study.system.biz.bo.dept.QueryDeptBO;
import com.springcloud.study.system.biz.dto.dept.SaveDeptDTO;
import com.springcloud.study.system.biz.entity.dept.SysDeptDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * sysDeptDTO convert sysDeptDO
 *
 * @author wangtongzhou
 * @since 2020-06-15 21:13
 */
@Mapper
public interface SysDeptConvert {

    SysDeptConvert INSTANCE = Mappers.getMapper(SysDeptConvert.class);

    /**
     * saveDeptDTO convert sysDeptDO
     *
     * @param saveDeptDTO saveDeptDTO
     * @return sysDeptDO
     */
    @Mappings({})
    SysDeptDO convert(SaveDeptDTO saveDeptDTO);

    /**
     * deptTreeBO convert queryDeptBO
     *
     * @param sysDeptDO 部门信息
     * @return deptTreeBO
     */
    @Mappings({})
    DeptTreeBO convert(SysDeptDO sysDeptDO);


    /**
     * deptTreeBOList convert queryDeptBOList
     *
     * @param deptDOList 部门信息
     * @return deptTreeBOList
     */
    List<DeptTreeBO> convert(List<SysDeptDO> deptDOList);
}
