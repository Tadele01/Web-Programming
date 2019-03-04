package collegedreamersdemo.demo.services;


import collegedreamersdemo.demo.models.Lecturer;

import java.util.List;

public interface LecturerService {
    List<Lecturer> findAll();

//    Lecturer findeOne(Long id);

    Lecturer save(Lecturer lecturer);

//    void removeOne(Long id);
}
