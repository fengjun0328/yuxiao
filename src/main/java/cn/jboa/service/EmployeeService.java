package cn.jboa.service;

import cn.jboa.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getChaKan(Employee employee);

    public Integer  add(Employee employee);

    public Integer  del(int SN);
}
