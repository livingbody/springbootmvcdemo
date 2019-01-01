package cn.goingtodo.springmvcdemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classPath")
public class MyController2 {

    //3.@RequestMapping注解表明该方法处理那些URL对应的HTTP请求，也就是我们常说的URL路由（routing)，请求的分发工作是有Spring完成的。
    @RequestMapping("/methodPath")
    public String method() {
        return "mapping url is /classPath/methodPath";
    }
}
