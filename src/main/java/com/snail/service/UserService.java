package com.snail.service;

import com.snail.domain.User;

public interface UserService {

    int addUser(User user);

//    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);


//    @Insert("insert into t_user(userName,password,phone) values(#{userName},#{password},#{phone})")
//    int insertUser(UserDomain userDomain);

}
