package com.spring.boot.dao;
import com.spring.boot.bean.User;
import org.apache.ibatis.annotations.*;


import java.util.List;
@Mapper
public interface UserDao {
    @Select("select * from user")
    public List<User> AllUser();

    @Update("<script> " + "update user" +
            "<set>"+  "<if test='uname!=null'>uname=#{uname},</if>"+
            "<if test='upassword!=null'>upassword=#{upassword},</if>"+
            "</set>"+ "where uid=#{uid}"+
            " </script> ")
    public int Update(User user);

    @Insert("insert into user values(null,#{user.uname},#{user.upassword})")
    @Options(keyProperty = "uid",useGeneratedKeys = true)
    public int add(@Param("user")User user);

    @Delete("delete from user")
    public  void deleteAll();
}
