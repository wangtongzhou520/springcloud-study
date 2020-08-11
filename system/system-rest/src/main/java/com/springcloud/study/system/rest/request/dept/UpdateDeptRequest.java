package com.springcloud.study.system.rest.request.dept;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 更新部门
 *
 * @author wangtongzhou
 * @since 2020-08-11 15:09
 */
@Data
@Accessors(chain = true)
public class UpdateDeptRequest implements Serializable {
    /**
     * 部门id
     */
    private Integer id;

    /**
     * 部门名称
     */
    @NotBlank(message = "部门名称不能为空")
    private String name;

    /**
     * 上级部门id
     */
    private Integer parentId = 0;

    /**
     * 部门在当前层级下的顺序，由小到大
     */
    @NotNull(message = "展示顺序不可为空")
    private Integer seq;

    /**
     * 备注
     */
    private String remark;
}
