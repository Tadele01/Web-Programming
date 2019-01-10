//package collegedreamersdemo.demo.services;
//
//import collegedreamersdemo.demo.models.User;
//import collegedreamersdemo.demo.repositories.UserRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//
//@Service
//public class LoginServiceStubImp implements LoginService {
//    private UserRepository userRepository;
//    @Override
//    public boolean authentice(String username, String password) {
//
//        User user = userRepository.findByUsername();
//        if(user == null){
//            System.out.println("no user found by this name ");
//            return false;
//        }
//        else {
//            System.out.println("user found ");
//            return true;
//        }
//    }
//
//
//}
