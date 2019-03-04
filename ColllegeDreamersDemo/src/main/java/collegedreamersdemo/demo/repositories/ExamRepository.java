package collegedreamersdemo.demo.repositories;

import collegedreamersdemo.demo.models.Exam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("examRepository")
public interface ExamRepository  extends CrudRepository<Exam, Long> {

}
