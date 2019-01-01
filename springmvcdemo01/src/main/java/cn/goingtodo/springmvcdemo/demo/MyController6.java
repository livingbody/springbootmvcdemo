package cn.goingtodo.springmvcdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController6 {

//    @RequestMapping("/myhello/{name}")
//    public String hello(@PathVariable("name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "/Hello!";
//    }
    @GetMapping("/myhello/{name}")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
