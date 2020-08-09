package com.springcloud.study.system.rest.controller;

import com.springcloud.study.common.core.vo.CommonResponse;
import com.springcloud.study.system.biz.dto.dept.SaveDeptDTO;
import com.springcloud.study.system.biz.service.dept.SysDeptService;
import com.springcloud.study.system.rest.convert.dept.SysDeptUserConvert;
import com.springcloud.study.system.rest.request.dept.SaveDeptRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门接口
 *
 * @author wangtongzhou
 * @since 2020-06-03 20:22
 */
@RestController
@RequestMapping("/sys/dept")
@Api("部门信息")
public class DeptController {

    @Autowired
    private SysDeptService sysDeptService;

    /**
     * 添加部门
     *
     * @param saveDeptRequest saveDeptRequest
     * @return 返回信息
     */
    @PostMapping("/add")
    @ApiOperation("添加部门信息")
    public CommonResponse<?> addDept(SaveDeptRequest saveDeptRequest) {
        SaveDeptDTO deptDTO = SysDeptUserConvert.INSTANCE.convert(saveDeptRequest);
        sysDeptService.saveDept(deptDTO);
        return CommonResponse.ok();
    }
}
