package cn.goingtodo.demo.mapper;

import cn.goingtodo.demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user where id=#{userId}")
    User findBookById(@Param("id") Long userId);

    @Select("select * from user")
    List<User> findall();
}
