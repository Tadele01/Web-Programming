package collegedreamersdemo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ExamController {
    @RequestMapping("/exam")
    public String course(Model model) {


        return "exam";
    }
}
