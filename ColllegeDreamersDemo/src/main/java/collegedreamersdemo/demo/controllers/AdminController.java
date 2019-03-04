package collegedreamersdemo.demo.controllers;

import collegedreamersdemo.demo.models.Course;
import collegedreamersdemo.demo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Qualifier("courseRepository")
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/addcourse")
    public String addCourseForm(Model model) {
        Course course = new Course();
        model.addAttribute("course", course);

        return "AddCourse";
    }

    @PostMapping("/addcourse")
    public String addCourse(Course course){

        courseRepository.save(course);

        return "redirect:/course";
    }

    @GetMapping("/deletecourse/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);

        return "redirect:/course";
    }

    @GetMapping("/editcourse/{id}")
    public String displayEditForm(@PathVariable Long id, Model model) {
        Course course = courseRepository.findByCourseId(id);

        model.addAttribute("course", course);

        return "EditCourse";
    }

    @PostMapping("/editcourse/{id}")
    public String editCourse(@PathVariable Long id, Course course) {

        Course course1 = courseRepository.findByCourseId(id);

        course1.title = course.title;
        course1.description = course.description;
        course1.courseCode = course.courseCode;
        course1.credit = course.credit;

        courseRepository.save(course1);

        return "redirect:/course";
    }
}
