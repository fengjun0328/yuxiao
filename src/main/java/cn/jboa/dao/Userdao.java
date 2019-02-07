package cn.jboa.dao;

import cn.jboa.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Userdao {
    public User getUilte(@Param("user")User user);
}
