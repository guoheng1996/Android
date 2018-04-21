package com.guoheng.controller;

import com.guoheng.pojo.User;
import com.guoheng.service.UserService;
import com.guoheng.service.impl.UserServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("password")
@Controller
public class APIController {

    @Autowired
    private UserService service;

    @RequestMapping("/1")
    public @ResponseBody()
    String index(HttpServletRequest request) throws Exception {

        //userMapper.findUserById(1);
        return "hello world";
    }

    @RequestMapping("/2")
    public @ResponseBody
    List<User> hello2(HttpServletRequest request) throws Exception {

        System.out.print("aa");
        //List<User> users = new ArrayList<User>();

//        for (int i = 1; i < 5; i++) {
//            User user = new User();
//            user.setOpenID(i + "111111");
//            user.setName("测试" + i);
//            users.add(user);
//        }
        //service.addUser(users);

        //int id = Integer.parseInt(request.getParameter("id"));

        return service.findAllUser();
    }
}
