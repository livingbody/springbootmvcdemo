package cn.goingtodo.demo;

import cn.goingtodo.demo.mapper.UserMapper;
import cn.goingtodo.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(userMapper.findall().toString());
        List<User> list = userMapper.findall();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAllUser() {


    }
}

