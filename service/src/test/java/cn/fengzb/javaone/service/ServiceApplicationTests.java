package cn.fengzb.javaone.service;

import cn.fengzb.javaone.service.domain.UserDO;
import cn.fengzb.javaone.service.inter.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    private UserService userService;

    @Test
    public void testUserServcie() {

        UserDO userDO = userService.getUser();

        Assert.assertNotNull(userDO);
        Assert.assertEquals(1, userDO.getUserId().longValue());


    }

}
