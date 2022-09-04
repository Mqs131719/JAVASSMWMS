package com.miau.javassmwms.service.impl;

import com.miau.javassmwms.config.SystemConfig;
import com.miau.javassmwms.dao.UserDao;
import com.miau.javassmwms.entity.User;
import com.miau.javassmwms.service.intf.UserService;
import com.miau.javassmwms.util.PassUtils;
import com.miau.javassmwms.util.StringUtil;
import com.miau.javassmwms.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public R save(User user) {
        // 校验参数
        if (user != null){
            if (StringUtil.isNotEmpty(user.getName(),user.getPassword())){
                // 密码转为密文
                user.setPassword(PassUtils.aesenc(SystemConfig.PASS_KEY,user.getPassword()));
                // 新增
                if (dao.save(user) > 0){
                    return R.ok();
                }
            }
        }
        return R.fail();
    }

    @Override
    public R login(String name, String password, HttpSession session) {
        // 校验参数
        if (StringUtil.isNotEmpty(name,password)){
            // 查询数据库
            User user = dao.selectByName(name);
            // 验证书否存在用户
            if (user != null){
                // 校验密码
                    if (user.getPassword().equals(PassUtils.aesenc(SystemConfig.PASS_KEY,password))){
                        // 登录成功 存储到session中
                        session.setAttribute("user",user);
                        return R.ok();
                    }
            }
        }
        return R.fail();
    }

//    @Override
//    public R login(User user, HttpSession session) {
//        //1.查询用户
//        User u1 = dao.selectByName(user.getName());
//        if (u1 != null) {
//            //2.验证密码
//            if (u1.getPassword().equals(user.getPassword())) {
//                //登录 成功
//                //3.存储登录用户 到会话中
//                session.setAttribute("user", u1);
//                //4.登录 成功
//                return new R(200, "OK", null);
//            } else {
//                //密码错误
//                return new R(400, "FAIL", "密码错误！");
//            }
//        } else {
//            //账号不存在
//            return new R(400, "FAIL", "账号错误！");
//        }
//    }
}


