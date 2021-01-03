package studio.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import studio.demo.exception.UserIllegalRegistrationException;
import studio.demo.exception.UserWithThisUsernameIsNotExist;
import studio.demo.model.entity.User;
import studio.demo.model.service.UserServiceModel;

import java.io.IOException;

public interface UserService extends UserDetailsService {
    UserServiceModel register(UserServiceModel userServiceModel) throws UserIllegalRegistrationException, IOException;

    UserServiceModel findByUserName(String username);

    User findByEmail(String email);
    User findByPhoneNumber(String phone);

    UserServiceModel update (UserServiceModel inputUser) throws UserWithThisUsernameIsNotExist;
}
