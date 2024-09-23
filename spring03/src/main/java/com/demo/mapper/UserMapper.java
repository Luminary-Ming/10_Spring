package com.demo.mapper;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from tb_user where id = #{id}")
    public User finUserById(Integer id);

    @Select("select * from tb_user")
    public List<User> findAll();

    @Insert("insert into tb_user(name,age,sex,birthday)values(#{name},#{age},#{sex},#{birthday})")
    public Integer addUser(User user);

    @Delete("delete from tb_user where id = #{id}")
    public Integer deleteById(Integer id);
}
