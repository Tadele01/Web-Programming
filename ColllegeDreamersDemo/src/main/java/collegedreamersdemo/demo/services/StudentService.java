package collegedreamersdemo.demo.services;



import collegedreamersdemo.demo.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

//    Student findeOne(Long id);

    Student save(Student student);

//    void removeOne(Long id);
}
