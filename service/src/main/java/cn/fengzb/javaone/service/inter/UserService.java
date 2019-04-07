package cn.fengzb.javaone.service.inter;

import cn.fengzb.javaone.service.domain.UserDO;

/**
 * @program: javaone
 * @description: 用户服务
 * @author: fengzb
 * @create: 2019-04-07 22:37
 */
public interface UserService {

    /**
     * 获取用户
     * @return
     */
    UserDO getUser();

}