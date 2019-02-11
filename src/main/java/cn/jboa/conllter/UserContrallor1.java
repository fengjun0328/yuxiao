package cn.jboa.conllter;

import cn.jboa.pojo.Department;
import cn.jboa.pojo.Employee;
import cn.jboa.pojo.Position;
import cn.jboa.service.DepartmentService;
import cn.jboa.service.EmployeeService;
import cn.jboa.service.PositionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserContrallor1 {

    @Resource
    private DepartmentService departmentService;
    @Resource
    private PositionService positionService;
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/delu.html")
    public String getChaKan(Employee employee, Model model){
        List<Department>D=departmentService.getBuMe();
        List<Position>P=positionService.getWeiZhi();
        List<Employee>E=employeeService.getChaKan(employee);
        model.addAttribute("D",D);
        model.addAttribute("P",P);
        model.addAttribute("E",E);
        return "denlu";
    }
    @RequestMapping("/del.html")
    public  String  del(@RequestParam("id")Integer id){
        employeeService.del(id);
        return "redirect:/delu.html";
    }

    @RequestMapping("/adds.html")
    public  String  adds(Employee employee, Model model){
        List<Department>D=departmentService.getBuMe();
        List<Position>P=positionService.getWeiZhi();
        model.addAttribute("D",D);
        model.addAttribute("P",P);
        return "add";
    }
    @RequestMapping(value = "/add.html",method = RequestMethod.POST)
    public String add(Employee employee, Model model){
        if(employeeService.add(employee)!=null){
              System.out.println("添加成功！");
              return "redirect:/delu.html";
        }else{
            System.out.println("添加失败！");
        }
        return  "add";
    }
}
