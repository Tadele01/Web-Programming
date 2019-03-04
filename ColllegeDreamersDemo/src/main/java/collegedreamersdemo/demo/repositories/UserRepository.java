package collegedreamersdemo.demo.repositories;





import collegedreamersdemo.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {

//    User findByConfirmationToken(String confirmationToken);
    User findByUsername(String username);
    User findByEmail(String email);
    //User findOne(Long id);
    List<User> findAll();
}