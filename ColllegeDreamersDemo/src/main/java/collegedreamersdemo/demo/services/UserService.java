
package collegedreamersdemo.demo.services;

import java.util.Optional;
import java.util.Set;

import collegedreamersdemo.demo.models.User;
import collegedreamersdemo.demo.models.security.UserRole;



public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);

    User findByUsername(String username);

    User findByEmail(String email);

    User save(User user);

//    Optional<User> findById(Long id);
    //User findOne(Long id);

    void saveUser(User user);

    User findByConfirmationToken(String token);
}
