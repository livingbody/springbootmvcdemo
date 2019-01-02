package cn.goingtodo.springmvcdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller

public class StudentController {
    private List<Student> list = new ArrayList<Student>();

    @RequestMapping(value = "/stulist", method = RequestMethod.GET)
    public ModelAndView hello() {
        list.add(new Student(1001, "习近平", "男"));
        list.add(new Student(1002, "李克强", "男"));
        list.add(new Student(1003, "汪洋", "男"));
        list.add(new Student(1004, "杨来武", "男"));
        ModelAndView mav = new ModelAndView("/list");
        mav.addObject("stuList", list);
        return mav;
    }

    //form读取数据，并传送到list页面
    @RequestMapping(value = "/stuadd", method = RequestMethod.POST)
    public String save(@ModelAttribute(value = "student") Student student, Model model) {
        System.out.println(student.toString());
        list.add(student);
        model.addAttribute("stuList", list);
        return "list";
    }

    //进入添加数据页面
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String index() {
        return "/add";
    }
}
