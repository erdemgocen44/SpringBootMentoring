package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("submit")
    public String login(@RequestParam("username")String username,Model m) {
        m.addAttribute("kullaniciAdi", username);
        return "login";
    }
    
}
