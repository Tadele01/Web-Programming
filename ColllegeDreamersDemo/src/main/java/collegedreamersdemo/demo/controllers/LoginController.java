package collegedreamersdemo.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/loginuser")
public class LoginController {
    @GetMapping
    public String login(){
        return "loginuser";
    }
    @PostMapping
    public String processDesign(
           ) {

        return "redirect:/index";
    }
}
