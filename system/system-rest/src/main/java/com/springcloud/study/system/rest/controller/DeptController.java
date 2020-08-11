package com.springcloud.study.system.rest.controller;

import com.springcloud.study.common.core.vo.CommonResponse;
import com.springcloud.study.system.biz.dto.dept.SaveDeptDTO;
import com.springcloud.study.system.biz.dto.dept.UpdateDeptDTO;
import com.springcloud.study.system.biz.service.dept.SysDeptService;
import com.springcloud.study.system.rest.convert.dept.SysDeptRequestConvert;
import com.springcloud.study.system.rest.request.dept.SaveDeptRequest;
import com.springcloud.study.system.rest.request.dept.UpdateDeptRequest;
import com.springcloud.study.system.rest.vo.dept.DeptTreeVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PostMapping("/save")
    @ApiOperation("添加部门信息")
    public CommonResponse<?> saveDept(@RequestBody SaveDeptRequest saveDeptRequest) {
        SaveDeptDTO deptDTO = SysDeptRequestConvert.INSTANCE.convert(saveDeptRequest);
        sysDeptService.saveDept(deptDTO);
        return CommonResponse.ok();
    }

    /**
     * 修改部门信息
     *
     * @param updateDeptRequest
     * @return true or false
     */
    @PostMapping("/updateDept")
    @ApiOperation("修改部门信息")
    public CommonResponse<?> updateDept(@RequestBody UpdateDeptRequest updateDeptRequest) {
        UpdateDeptDTO deptDTO = SysDeptRequestConvert.INSTANCE.convert(updateDeptRequest);
        sysDeptService.updateDept(deptDTO);
        return CommonResponse.ok();
    }

    /**
     * 查询部门树
     *
     * @return 部门树
     */
    @GetMapping("/queryDeptTree")
    @ApiOperation("部门树")
    public CommonResponse<List<DeptTreeVO>> queryDeptTree() {
        List<DeptTreeVO> treeVoList =
                SysDeptRequestConvert.INSTANCE.convert(sysDeptService.deptTrees());
        return CommonResponse.ok(treeVoList);
    }

    /**
     * 删除部门
     *
     * @param id id
     * @return true or false
     */
    @PostMapping("/delDept")
    @ApiOperation("部门树")
    public CommonResponse<?> delDept(@RequestBody Integer id) {
        sysDeptService.delDeptById(id);
        return CommonResponse.ok();
    }

}
