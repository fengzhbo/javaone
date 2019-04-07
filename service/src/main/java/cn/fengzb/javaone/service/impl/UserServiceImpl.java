package cn.fengzb.javaone.service.impl;

import cn.fengzb.javaone.service.domain.UserDO;
import cn.fengzb.javaone.service.inter.UserService;
import org.springframework.stereotype.Service;

/**
 * @program: javaone
 * @description: 用户服务实现类
 * @author: fengzb
 * @create: 2019-04-07 22:38
 */
@Service
public class UserServiceImpl implements UserService {


    /**
     * 获取用户
     *
     * @return
     */
    @Override
    public UserDO getUser() {
        return new UserDO() {{
            setUserId(1);
            setUserName("fengzb");
        }};
    }
}