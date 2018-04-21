package com.guoheng.service.impl;

import com.guoheng.dao.UserMapper;
import com.guoheng.pojo.User;
import com.guoheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("service")
public class UserServerImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    public void addUser(List<User> users) throws Exception {
        for (int i = 0; i < users.size(); i++) {
            if (i<2) {
                mapper.addUser(users.get(i));
            }else {
                throw new RuntimeException();
            }
        }
    }

    public User findUserById(int i) throws Exception {
        return mapper.findUserById(i);
    }

    public List<User> findAllUser() throws Exception {
        return mapper.findAllUser();
    }
}
