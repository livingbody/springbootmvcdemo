package cn.goingtodo.demo.controller;

import cn.goingtodo.demo.mapper.UserMapper;
import cn.goingtodo.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 1.官方建议Controller放置位置最好和Application在一起，不这样的话扫描不到。
 * 2.如果不在同一个package里面的话，就要添加@ComponentScan @EnableAutoConfiguration
 * 3.相信很多人碰到这个问题了，半天url不进Controller,麻烦的。
 */


@Controller
@ComponentScan
@EnableAutoConfiguration
public class UserController {

    @RequestMapping("/userlist")
    public String userList(Map<String, Object> map) {
        List<User> list = userMapper.findall();
        map.put("list", list);
        return "user";
    }

    @Autowired
    private UserMapper userMapper;
}
