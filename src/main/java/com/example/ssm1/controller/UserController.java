package com.example.ssm1.controller;

import com.example.ssm1.domain.User;
import com.example.ssm1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    public String users(Model model){
        model.addAttribute("users", userMapper.findAll());
        return "users";
    }

    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        userMapper.save(user);
        return "redirect:/users";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        userMapper.deleteById(id);
        return "redirect:/users";
    }

    @RequestMapping("/toUpdate")
    public String findOne(Integer id, Model model){
        model.addAttribute("user",userMapper.findOne(id));
        return "update";
    }

    @RequestMapping("/update")
    public String update(User user){
        userMapper.updateById(user);
        return "redirect:/users";
    }
}
