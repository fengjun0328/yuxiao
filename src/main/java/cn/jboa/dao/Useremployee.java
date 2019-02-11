package cn.jboa.dao;

import cn.jboa.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Useremployee {
    public List<Employee>getChaKan(@Param("employee") Employee employee);
    public Integer  add(@Param("employee") Employee employee);
    public Integer  del(@Param("SN")int SN);
}
