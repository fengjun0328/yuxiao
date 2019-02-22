package cn.jboa.conllter;

import cn.jboa.pojo.Claimvoucher;
import cn.jboa.service.ClaimvoucherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserContrallor2 {
    @Resource
    private ClaimvoucherService claimvoucherService;

    @RequestMapping("/Time.html")
    public String Time(Claimvoucher claimvoucher, Model model){
        List<Claimvoucher>C=claimvoucherService.getTime(claimvoucher);
        model.addAttribute("C",C);
        return  "Time";
    }

    @RequestMapping("/Timeshan.html")
    public String  shan(Claimvoucher claimvoucher, Model model, @RequestParam("id")Integer id){
        claimvoucherService.del(id);
        return  "redirect:/Time.html";
    }
}
