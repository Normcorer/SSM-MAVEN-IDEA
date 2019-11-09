package cn.zyj.Controller;

import cn.zyj.pojo.User;
import cn.zyj.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(){
        System.out.println("Hello");
        return null;
    }
    @RequestMapping("/find")
    @ResponseBody
    public User find(Integer id){
        User user = userService.findById(id);
        System.out.println(user.getUsername()+user.getPassword());
        return userService.findById(id);
    }
}