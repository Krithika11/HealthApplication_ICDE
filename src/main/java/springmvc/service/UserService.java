package springmvc.service;

import springmvc.model.User;

public interface UserService {

  int register(User user);

  User validateUser(User user);

  boolean validateUserRegistration(User user);

  boolean validateSymptom(User user);
}
