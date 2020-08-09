package com.springcloud.study.system.rest.request.dept;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 添加部门
 *
 * @author wangtongzhou
 * @since 2020-06-03 20：43
 */
@Data
@Accessors(chain = true)
public class SaveDeptRequest implements Serializable {

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
