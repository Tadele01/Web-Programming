package collegedreamersdemo.demo.repositories;

import collegedreamersdemo.demo.models.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {

}
