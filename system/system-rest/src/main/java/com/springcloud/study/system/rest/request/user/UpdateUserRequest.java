package com.springcloud.study.system.rest.request.user;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 更新用户信息
 *
 * @author wangtongzhou
 * @since 2020-08-18 21:11
 */
@Data
@Accessors(chain = true)
public class UpdateUserRequest {

    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名称
     */
    @NotBlank(message = "用户名不允许为空")
    @Length(min = 1, max = 20, message = "用户名长度需要在20个字符以内")
    private String username;

    /**
     * 手机号
     */
    @NotBlank(message = "电话不允许为空")
    @Length(min = 1, max = 13, message = "电话长度需要在13个字符以内")
    private String telephone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 用户所在部门的id
     */
    @NotNull(message = "部门值不允许为空")
    private Integer deptId;

    /**
     * 状态，1：正常，0：冻结状态，2：删除
     */
    @NotNull(message = "用户状态不允许为空")
    private Integer status;

    /**
     * 备注
     */
    private String remark;
}
