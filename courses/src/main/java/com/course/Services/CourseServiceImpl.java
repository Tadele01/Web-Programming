package com.course.Services;
import com.course.Repository.CourseRepository;
import com.course.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class CourseServiceImpl implements  CourseService {
    @Autowired
    private CourseRepository CourseRepo;
    @Override
public Course findById(Integer Id) {
        return this.CourseRepo.findOne(Id);
}
}