package collegedreamersdemo.demo.services;


import java.util.Optional;
import java.util.Set;

import collegedreamersdemo.demo.models.User;
import collegedreamersdemo.demo.models.security.UserRole;
import collegedreamersdemo.demo.repositories.RoleRepository;
import collegedreamersdemo.demo.repositories.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Transactional
	public User createUser(User user, Set<UserRole> userRoles) {
		User localUser = userRepository.findByUsername(user.getUsername());

		if(localUser != null) {
			LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
		} else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}

			user.getUserRoles().addAll(userRoles);


			localUser = userRepository.save(user);
		}

		return localUser;
	}

	@Override
	public User save(User user)  {
		return userRepository.save(user);
	}

//	@Override
//	public Optional<User> findById(Long id) {
//		return userRepository.findById(id);
//	}


	@Override
	public void saveUser(User user) {

	}

	@Override
	public User findByConfirmationToken(String token) {
		return null;
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}


}
