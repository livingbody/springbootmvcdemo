package cn.goingtodo.springmvcdemo.demo;

//1.SpringApplication是Spring Boot框架中描述Spring应用的类，它的run()方法会创建一个Spring应用上下文（Application Context）。
//本例中，自动扫描当前应用类的路径依赖，发现spring-webmvc，则自动启动内嵌Servlet容器（默认tomcat）用于处理http请求。

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

//2.spring WebMvc框架会将Servlet容器里收到的HTTP请求根据路径分发给对应的@Controller类进行处理，@RestController是一类特殊的@Controller，它的返回值直接作为HTTP Response的Body部分返回给浏览器。

@MapperScan("cn.goingtodo.springmvcdemo.demo.mapper")
@EnableCaching
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //3.@RequestMapping注解表明该方法处理那些URL对应的HTTP请求，也就是我们常说的URL路由（routing)，请求的分发工作是有Spring完成的。

}


/**
 * 一、搭建基本环境
 * 1、导入数据库文件 创建出department和employee表
 * 2、创建javaBean封装数据
 * 3、整合MyBatis操作数据库
 * 1.配置数据源信息
 * 2.使用注解版的MyBatis；
 * 1）、@MapperScan指定需要扫描的mapper接口所在的包
 * 二、快速体验缓存
 * 步骤：
 * 1、开启基于注解的缓存 @EnableCaching
 * 2、标注缓存注解即可
 *
 * @Cacheable
 * @CacheEvict
 * @CachePut 默认使用的是ConcurrentMapCacheManager==ConcurrentMapCache；将数据保存在	ConcurrentMap<Object, Object>中
 * 开发中使用缓存中间件；redis、memcached、ehcache；
 * 三、整合redis作为缓存
 * Redis 是一个开源（BSD许可）的，内存中的数据结构存储系统，它可以用作数据库、缓存和消息中间件。
 * 1、安装redis：使用docker；
 * 2、引入redis的starter
 * 3、配置redis
 * 4、测试缓存
 * 原理：CacheManager===Cache 缓存组件来实际给缓存中存取数据
 * 1）、引入redis的starter，容器中保存的是 RedisCacheManager；
 * 2）、RedisCacheManager 帮我们创建 RedisCache 来作为缓存组件；RedisCache通过操作redis缓存数据的
 * 3）、默认保存数据 k-v 都是Object；利用序列化保存；如何保存为json
 * 1、引入了redis的starter，cacheManager变为 RedisCacheManager；
 * 2、默认创建的 RedisCacheManager 操作redis的时候使用的是 RedisTemplate<Object, Object>
 * 3、RedisTemplate<Object, Object> 是 默认使用jdk的序列化机制
 * 4）、自定义CacheManager；
 */