package cn.jboa.service.impl;

import cn.jboa.dao.Claimvoucherdao;
import cn.jboa.pojo.Claimvoucher;
import cn.jboa.service.ClaimvoucherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("claimvoucherService")
public class ClaimvoucherServiceimpl implements ClaimvoucherService {
    @Resource
    private Claimvoucherdao claimvoucherdao;

    @Override
    public List<Claimvoucher> getTime(Claimvoucher claimvoucher) {
        return claimvoucherdao.getTime(claimvoucher);
    }


    @Override
    public int del(int id) {
        return claimvoucherdao.del(id);
    }
}
