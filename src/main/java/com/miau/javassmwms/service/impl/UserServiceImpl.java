package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.dao.UserDao;
import com.miau.javassmwms.entity.User;
import com.miau.javassmwms.service.intf.UserService;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐░
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒░
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * 单身狗就这样默默地看着你，一句话也不说。
 *
 * @Author JohnnyMiau
 * @DateTime 2022/8/28 11:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public R login(User user, HttpSession session) {
        //1.查询用户
        User u1=dao.selectByName(user.getName());
        if(u1!=null){
            //2.验证密码
            if(u1.getPassword().equals(user.getPassword())){
                //登录 成功
                //3.存储登录用户 到会话中
                session.setAttribute("user",u1);
                //4.登录 成功
                return new R(200,"OK",null);
            }else {
                //密码错误
                return new R(400,"FAIL","密码错误！");
            }
        }else {
            //账号不存在
            return new R(400,"FAIL","账号错误！");
        }
    }
}
