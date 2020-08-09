package com.springcloud.study.system.biz.dto.dept;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 添加部门
 *
 * @author wangtongzhou
 * @since 2020-06-15 20:53
 */
@Data
@Accessors(chain = true)
public class SaveDeptDTO implements Serializable {
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
