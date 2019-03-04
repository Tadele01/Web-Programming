package collegedreamersdemo.demo.repositories;


import collegedreamersdemo.demo.models.Lecturer;
import org.springframework.data.repository.CrudRepository;

public interface LecturerRepository extends CrudRepository<Lecturer,Long> {
//    Lecturer findOne(Long id);
//    void delete(Long id);
}
