package com.springcloud.study.system.biz.bo.user;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 用户展示信息
 *
 * @author wangtongzhou
 * @since 2020-08-19 10:16
 */
@Data
@Accessors(chain = true)
public class SysUserBO {
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
     * 加密后的密码
     */
    private String password;

    /**
     * 用户所在部门的id
     */
    private Integer deptName;

    /**
     * 状态，1：正常，0：冻结状态，2：删除
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者
     */
    private String createOperator;

    /**
     * 修改者
     */
    private String modifiedOperator;

    /**
     * 更新操作者的ip地址
     */
    private String modifiedOperatorIp;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;
}