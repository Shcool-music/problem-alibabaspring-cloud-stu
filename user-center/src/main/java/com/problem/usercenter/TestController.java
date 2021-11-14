package com.problem.usercenter;

import com.problem.usercenter.domain.entity.user.User;
import com.problem.usercenter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public User insertUser() {
        User user = new User();
        user.setAvatarUrl("xxxx");
        user.setBonus(1);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        userMapper.insertSelective(user);
        return user;
    }
}
