package collegedreamersdemo.demo.controllers;


import collegedreamersdemo.demo.models.Exam;
import collegedreamersdemo.demo.models.Exam;
import collegedreamersdemo.demo.repositories.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamRepository cr;
    @GetMapping
    public String exam(Model model) {

        Iterable<Exam> exams = cr.findAll();
        model.addAttribute("a", "A");
        model.addAttribute("b", "B");
        model.addAttribute("c", "C");
        model.addAttribute("exams", exams);

        return "cc";
    }
}
