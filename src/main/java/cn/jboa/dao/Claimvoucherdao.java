package cn.jboa.dao;

import cn.jboa.pojo.Claimvoucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Claimvoucherdao {
    public List<Claimvoucher>getTime(@Param("claimvoucher")Claimvoucher claimvoucher);
    public Integer del(@Param("id") int id);
}
