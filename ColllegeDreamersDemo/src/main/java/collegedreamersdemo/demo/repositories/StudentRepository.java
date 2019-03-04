package collegedreamersdemo.demo.repositories;

import collegedreamersdemo.demo.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
//    Student findOne(long id);
//    void delete(Long id);
}
