//package com.snail;
//
//import com.snail.Mapper.UserMapper;
//import com.snail.domain.User;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringbootMybatisDemo2ApplicationTests {
//
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void test(){
//
//        userMapper.insert("winterchen", "123456", "12345678910");
//        User u = userMapper.findUserByPhone("12345678910");
//        Assert.assertEquals("winterchen", u.getName());
//    }
//
//
//
//}
