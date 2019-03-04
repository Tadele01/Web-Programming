package collegedreamersdemo.demo.services;


import collegedreamersdemo.demo.models.Course;
import collegedreamersdemo.demo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        List<Course> bookList = (List<Course>) courseRepository.findAll();

        List<Course> activeCourseList = new ArrayList<>();

        for (Course course : bookList) {
//            if(course.isActive()) {
                activeCourseList.add(course);
//            }
        }

        return activeCourseList;
    }

//    @Override
//    public Course findeOne(Long id) {
//        return courseRepository.findOne(id);
//    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> blurrySearch(String keyword) {
        List<Course> courseList = courseRepository.findByTitleContaining(keyword);

        List<Course> activeCourseList = new ArrayList<>();

        for (Course course : courseList) {
//            if(course.isActive()) {
                activeCourseList.add(course);
//            }
        }

        return activeCourseList;
    }

//    @Override
//    public void removeOne(Long id) {
//        courseRepository.delete(id);
//    }
}
