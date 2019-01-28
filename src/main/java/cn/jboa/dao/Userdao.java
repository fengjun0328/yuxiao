package cn.jboa.dao;

import cn.jboa.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface Userdao {
    public User getUilte(@Param("User")User user);
}
