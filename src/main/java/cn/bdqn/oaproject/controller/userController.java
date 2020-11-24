package cn.bdqn.oaproject.controller;

import cn.bdqn.oaproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
@Controller
public class userController {
    @Resource
    private UserService user;
    @RequestMapping("/user")
    public String find(){
        System.out.println("=====================================");
        int rel = user.findCount();
        System.out.println(rel);
        return "index";
    }
}
