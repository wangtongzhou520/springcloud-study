package com.springcloud.study.system.dto.user;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * save user dto
 *
 * @author wangtongzhou
 * @since 2020-08-13 21:25
 */
@Data
@Accessors(chain = true)
public class SaveUserDTO implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 用户所在部门的id
     */
    private Integer deptId;

    /**
     * 状态，1：正常，0：冻结状态，2：删除
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;
}
