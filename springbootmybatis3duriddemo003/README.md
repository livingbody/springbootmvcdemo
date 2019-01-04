# MyBatis踩坑记
遇坑无数，苦不堪言，下面交代下我正确的办法。
# 1.初始化
 ==为何使用1.2.0我也不清楚，用其他版本标记不起作用。
   因为出现问题
   ```$xslt
springboot  nested exception is java.lang.IllegalArgumentException: Property 'sqlSessionFactory' o
```
## 1.1不要选择mybatis
## 1.2选择jdbc/web/mysql
## 1.3加入mybatis，  手动填写pom.xml
      ``` <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.2.0</version>
        </dependency>  
      ```
      
 ## 1.4加入lombok，  手动填写pom.xml，我喜欢用Data
 ```
         <dependency>
             <groupId>org.projectlombok</groupId>
             <artifactId>lombok</artifactId>
             <optional>true</optional>
         </dependency>
  ```    
 # 2.解决编译过程中不能注入问题
  ===@MapperScan("cn.goingtodo.demo.mapper")
  在application上面加入这个才可以正常注入，否则mapper不工作
  
# 3.工程结构
```$xslt
livingbody@livingbody-PC:~/IdeaProjects/springbootmybatis3demo002$ tree 
.
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── springbootmybatis3demo002.iml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── cn
│   │   │       └── goingtodo
│   │   │           └── demo
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── DemoApplication.java
│   │   │               ├── mapper
│   │   │               │   └── UserMapper.java
│   │   │               └── pojo
│   │   │                   └── User.java
│   │   └── resources
│   │       ├── application.yml
│   │       ├── static
│   │       ├── templates
│   │       │   └── user.ftl
│   │       └── test.sql
│   └── test
│       └── java
│           └── cn
│               └── goingtodo
│                   └── demo
│                       └── DemoApplicationTests.java
└── target
    ├── classes
    │   ├── application.yml
    │   ├── cn
    │   │   └── goingtodo
    │   │       └── demo
    │   │           ├── controller
    │   │           │   └── UserController.class
    │   │           ├── DemoApplication.class
    │   │           ├── mapper
    │   │           │   └── UserMapper.class
    │   │           └── pojo
    │   │               └── User.class
    │   ├── templates
    │   │   └── user.ftl
    │   └── test.sql
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    └── test-classes
        └── cn
            └── goingtodo
                └── demo
                    └── DemoApplicationTests.class


``` 