package com.springcloud.study.system.biz.service.dept;

import com.springcloud.study.system.biz.dto.dept.SaveDeptDTO;
import com.springcloud.study.system.biz.dto.dept.UpdateDTO;

/**
 * 部门服务
 *
 * @author wangtongzhou
 * @since 2020-06-15 20:19
 */
public interface SysDeptService {

    /**
     * 保存部门信息
     *
     * @param saveDeptDTO 添加部门
     */
    void saveDept(SaveDeptDTO saveDeptDTO);


    /**
     * 更新用户信息
     *
     * @param updateDTO 用户信息
     */
    void updateDept(UpdateDTO updateDTO);

}
