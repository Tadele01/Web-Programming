package com.course.Controller;

import com.course.Repository.CourseRepository;
import com.course.Services.CourseService;
import com.course.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.lang.Long;


@Controller
public class HomeController {
    @Autowired
    private CourseService courseser;
    CourseRepository CR;
    @RequestMapping("/")
    public String Course(Model model) {

        Course course1 = courseser.findById(1);
//        Course course2 = courseser.findById(2L);
//        Course course3 = courseser.findById(3L);
//        Course course4 = courseser.findById(4L);
//        Course course5 = courseser.findById(5L);
//        Course course6 = courseser.findById(6L);
//        Course course7 = courseser.findById(7L);
        model.addAttribute("course", course1);

        return "Course";
        //    @GetMapping("/Cour")
//public List<Course> getSubject(){
//      return CR.findAll();
//
//
    }
}



