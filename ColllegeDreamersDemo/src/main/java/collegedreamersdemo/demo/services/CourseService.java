package collegedreamersdemo.demo.services;



import collegedreamersdemo.demo.models.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();

//    Course findeOne(Long id);

    Course save(Course course);

    List<Course> blurrySearch(String title);

//    void removeOne(Long id);
}

