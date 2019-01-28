package cn.jboa.service.impl;

import cn.jboa.dao.Userdao;
import cn.jboa.pojo.User;
import cn.jboa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private Userdao userdao;

    @Override
    public User getUilte(User user) {
        return userdao.getUilte(user);
    }
}
