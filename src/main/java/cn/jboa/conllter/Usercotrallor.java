package cn.jboa.conllter;

import cn.jboa.pojo.User;
import cn.jboa.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class Usercotrallor {

    @Resource
    private UserService  userService;

    @RequestMapping("/index.html")
    public  String  index(@ModelAttribute User user)
    {
        return   "index";
    }
    @RequestMapping(value = "/index.html",method = RequestMethod.POST)
    public  String  login(User user) {
        if (userService.getUilte(user)!=null) {
            return "redirect:/delu.html";
            }
        return "index";
    }



}
