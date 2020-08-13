package com.springcloud.study.system.biz.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.study.system.biz.entity.user.SysUserDO;
import org.springframework.stereotype.Repository;

/**
 * user mapper
 *
 * @author wangtongzhou
 * @since 2020-08-31 21:33
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUserDO> {
}
