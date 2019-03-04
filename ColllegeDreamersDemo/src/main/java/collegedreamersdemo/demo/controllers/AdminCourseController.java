package collegedreamersdemo.demo.controllers;
import collegedreamersdemo.demo.models.Course;
import collegedreamersdemo.demo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/courses")
public  class AdminCourseController {

       @Autowired
        private CourseRepository cr;

        @GetMapping
        public String course(Model model) {

            Iterable<Course> courses = cr.findAll();

            model.addAttribute("courses", courses);

            return "bb";
        }

    }


