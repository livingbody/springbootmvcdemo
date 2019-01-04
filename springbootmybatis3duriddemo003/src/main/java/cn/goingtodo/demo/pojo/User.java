package cn.goingtodo.demo.pojo;

import lombok.Data;

/**
 * 1.lombok.Data不用多说了吧，这个真心好用，一个Data，省去getter/setter/toString
 * 2.lombok.AllArgsConstructor全参数构造函数，也有用的 @AllArgsConstructor
 */

@Data
public class User {
    private int id;
    private String user_name;
    private String user_password;
}
