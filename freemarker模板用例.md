# freemarker模板用例

## pom.xml引入

   ```xml
           <!--freemarker模板专用-->
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-freemarker</artifactId>
           </dependency>
   ```

## 2.controller调用，返回值对应templates下的*.ftl模板

```java
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

## 页面模板举例user.ftl

```html
<html>
<head>
    <title>FreeMarker的HelloWorld</title>
</head>
<body>
<#list list as item>
    ID：${item.id} , 年龄${item.user_name}, 密码${item.user_password}
    <br>
</#list>

</body>
</html>
```

