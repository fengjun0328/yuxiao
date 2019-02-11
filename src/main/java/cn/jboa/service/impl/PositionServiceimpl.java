package cn.jboa.service.impl;

import cn.jboa.dao.UserPosition;
import cn.jboa.pojo.Position;
import cn.jboa.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("positionService")
public class PositionServiceimpl implements PositionService {
@Resource
private UserPosition  userPosition;
    @Override
    public List<Position> getWeiZhi(){
    return userPosition.getWeiZhi();
    }
}
