package cn.jboa.service.impl;

import cn.jboa.dao.Useremployee;
import cn.jboa.pojo.Employee;
import cn.jboa.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("employeeService")
public class EmployeeServiceimpl implements EmployeeService {
    @Resource
    private Useremployee useremployee;
    @Override
    public List<Employee> getChaKan(Employee employee) {
        return useremployee.getChaKan(employee);
    }

    @Override
    public Integer del(int SN) {
        return useremployee.del(SN);
    }

    @Override
    public Integer add(Employee employee) {
        return useremployee.add(employee);
    }
}
