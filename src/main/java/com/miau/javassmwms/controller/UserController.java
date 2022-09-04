package com.miau.javassmwms.controller;

import com.miau.javassmwms.entity.User;
import com.miau.javassmwms.service.intf.UserService;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("login.do")
    public R login(String name,String password,HttpSession session) {
        return service.login(name, password, session);
    }
    @PostMapping ("save.do")
    public R save(User user) {
        return service.save(user);
    }
    @GetMapping("loginout.do")
    public R loginOut(HttpSession session) {
        session.invalidate();
        return R.ok();
    }
}
