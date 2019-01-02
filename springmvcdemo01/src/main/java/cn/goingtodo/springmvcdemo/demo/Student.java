package cn.goingtodo.springmvcdemo.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String gender;
}
