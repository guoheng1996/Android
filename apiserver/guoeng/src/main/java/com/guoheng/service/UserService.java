package com.guoheng.service;

import com.guoheng.pojo.User;

import java.util.List;

public interface UserService {

   void addUser(List<User> users) throws Exception;
   User findUserById(int i) throws Exception;
   List<User> findAllUser() throws Exception;
}
