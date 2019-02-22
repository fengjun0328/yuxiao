package cn.jboa.service;

import cn.jboa.pojo.Claimvoucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClaimvoucherService {
    public List<Claimvoucher> getTime(Claimvoucher claimvoucher);
    public  int del(int id);
}
