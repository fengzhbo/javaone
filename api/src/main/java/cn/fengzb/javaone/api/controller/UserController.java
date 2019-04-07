package cn.fengzb.javaone.api.controller;

import cn.fengzb.javaone.service.domain.UserDO;
import cn.fengzb.javaone.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: javaone
 * @description: 用户接口
 * @author: fengzb
 * @create: 2019-04-07 22:47
 */

@RequestMapping("/api/v1")
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/{userId}")
    public UserDO getUser(@PathVariable String userId) {

        return userService.getUser();

    }

}