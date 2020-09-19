package com.springcloud.study.system.dto.dept;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 修改用户的实体
 *
 * @author wangtongzhou
 * @since 2020-08-07 17:52
 */
@Data
@Accessors(chain = true)
public class UpdateDeptDTO implements Serializable {
    /**
     * 部门id
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 上级部门id
     */
    private Integer parentId;

    /**
     * 部门在当前层级下的顺序，由小到大
     */
    private Integer seq;

    /**
     * 备注
     */
    private String remark;
}
