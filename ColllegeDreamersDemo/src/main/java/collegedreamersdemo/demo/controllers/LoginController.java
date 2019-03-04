package collegedreamersdemo.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/loginU")
public class LoginController {
    @GetMapping
    public String login(){

        return "loginU";
    }

    @PostMapping
    public String processDesign() {

        return "redirect:/";
    }
}
