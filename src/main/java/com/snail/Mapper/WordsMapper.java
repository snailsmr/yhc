package com.snail.Mapper;

import com.snail.domain.User;
import com.snail.domain.WordsDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Words映射类
 */
@Mapper
public interface WordsMapper {

    @Select("SELECT * FROM T_USER2 WHERE PHONE = #{phone}")
    User findUserByPhone(@Param("phone") String phone);

    @Insert("INSERT INTO T_USER2(NAME, PASSWORD, PHONE) VALUES(#{name}, #{password}, #{phone})")
//    int insert(@Param("name") String name, @Param("password") String password, @Param("phone") String phone);
    int insert(User user);

    @Select("select * from word_11 limit #{start},#{end}")
    List<WordsDomain> selectWords(@Param("start") Integer start, @Param("end")Integer end);



}
