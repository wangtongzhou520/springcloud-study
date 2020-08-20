package com.springcloud.study.system.biz.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.study.system.biz.entity.user.SysUserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * user mapper
 *
 * @author wangtongzhou
 * @since 2020-08-31 21:33
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUserDO> {

    /**
     * 用户信息
     *
     * @param userName userName
     * @return 用户信息
     */
    SysUserDO querySysByUserName(@Param("userName") String userName);

    /**
     * 查询mail有没有注册过
     *
     * @param mail mail
     * @param id   用户id
     * @return 数量
     */
    int countByMail(@Param("mail") String mail, @Param("id") Integer id);

    /**
     * 查询mail有没有注册过
     *
     * @param telephone telephone
     * @param id        id
     * @return 数量
     */
    int countByTelephone(@Param("telephone") String telephone,
                         @Param("id") Integer id);

}
