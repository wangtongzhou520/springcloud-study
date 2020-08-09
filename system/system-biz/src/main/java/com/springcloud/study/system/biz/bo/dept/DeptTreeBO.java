package com.springcloud.study.system.biz.bo.dept;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * 部门数实体
 *
 * @author wangtongzhou
 * @since 2020-08-08 14:34
 */
@Data
@Accessors(chain = true)
public class DeptTreeBO extends QueryDeptBO {

    /**
     * 下一层级数
     */
    List<DeptTreeBO> deptTreeBOList;
}
