package collegedreamersdemo.demo.repositories;

import collegedreamersdemo.demo.models.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("courseRepository")
public interface CourseRepository extends CrudRepository<Course, Long> {
    List<Course> findByTitleContaining(String keyword);
//    Course findOne(Long id);

    @Query("select c from Course c where c.id = ?1")
    Course findByCourseId(Long id);
}
