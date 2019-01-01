package cn.goingtodo.springmvcdemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController5 {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello World!";
    }
}
