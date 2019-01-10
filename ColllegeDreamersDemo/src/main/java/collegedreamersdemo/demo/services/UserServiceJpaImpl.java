//package collegedreamersdemo.demo.services;
//
//import collegedreamersdemo.demo.models.User;
//import collegedreamersdemo.demo.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@Primary
//public class UserServiceJpaImpl implements UserService {
//    @Autowired
//    private UserRepository userRepo;
//
//    @Override
//    public List<User> findAll() {
//        return (List<User>) this.userRepo.findAll();
//    }
//
//    @Override
//    public User findById(Long id) {
//        return this.userRepo.findOne(id);
//    }
//
//    @Override
//    public User create(User user) {
//        return this.userRepo.save(user);
//    }
//
//    @Override
//    public User edit(User user) {
//        return this.userRepo.save(user);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        this.userRepo.delete(id);
//    }
//}
