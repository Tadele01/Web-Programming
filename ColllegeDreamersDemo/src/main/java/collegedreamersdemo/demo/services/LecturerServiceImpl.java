package collegedreamersdemo.demo.services;

import collegedreamersdemo.demo.models.Lecturer;
import collegedreamersdemo.demo.repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    private LecturerRepository lecturerRepository;


    @Override
    public List<Lecturer> findAll() {
        return (List<Lecturer>) lecturerRepository.findAll();
    }

//    @Override
//    public Lecturer findeOne(Long id) {
//        return lecturerRepository.findOne(id);
//    }

    @Override
    public Lecturer save(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

//    @Override
//    public void removeOne(Long id) {
//        lecturerRepository.delete(id);
//    }
}
