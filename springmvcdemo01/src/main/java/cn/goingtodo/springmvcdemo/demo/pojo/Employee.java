package cn.goingtodo.springmvcdemo.demo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender; //性别 1男  0女
    private Integer dId;

}
