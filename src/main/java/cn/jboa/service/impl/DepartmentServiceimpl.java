package cn.jboa.service.impl;

import cn.jboa.dao.UserDepartment;
import cn.jboa.pojo.Department;
import cn.jboa.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("departmentService")
public class DepartmentServiceimpl implements DepartmentService {
  @Resource
  private UserDepartment userDepartment;
    @Override
    public List<Department> getBuMe() {
        return userDepartment.getBuMe();
    }
}
