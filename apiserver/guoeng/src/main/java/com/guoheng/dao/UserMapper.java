package com.guoheng.dao;


import com.guoheng.pojo.User;

import java.util.List;

public interface UserMapper {
    // 根据用户id查询用户信息
     User findUserById(int id) throws Exception;

     List<User> findAllUser() throws Exception;

    //新增用户
     void addUser(User user) throws Exception;
   
}
