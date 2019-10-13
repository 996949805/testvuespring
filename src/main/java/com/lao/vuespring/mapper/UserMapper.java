package com.lao.vuespring.mapper;

import com.lao.vuespring.beans.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Generated;

//@Mapper  //如果此处不使用注解，则可以在主配置文件中设置Mapper扫描路径
public interface UserMapper {

    @Select("select * from users where username=#{username}")
    public User getUserByUsername(String username);

    @Options(useGeneratedKeys=true,keyColumn = "id")
    @Insert("insert into users (username,password) values (#{username},'123456')")
    public int insertUser(User user);
}
