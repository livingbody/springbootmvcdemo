# mybatis3 用例

## mybatis3 pom.xml

```xml
  <!--集成mybatis，不要问我为什么要用这个 版本，其他版本好多注解认不出来-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.2.0</version>
        </dependency>
        <!--数据库用-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        
        <!--mysql驱动专用-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
```

## 编写Mapper

```java
import cn.goingtodo.demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user where id=#{userId}")
    User findBookById(@Param("id") Long userId);

    @Select("select * from user")
    List<User> findall();
}

```

## Application发现Mapper

```java

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 必须加 @MapperScan，不然找不到mapper类。。。。。。
 */
@MapperScan("cn.goingtodo.demo.mapper")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}


```

## Controller引用 Mapper

```java
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
```

## 数据库配置

```yaml

数据库驱动配置
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/test
    username: root
    password: root
    driver-class-name: com.mysql.cj.jdbc.Driver
```

