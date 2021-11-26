package springmvc.dao;

import springmvc.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(User login);

  boolean validateUserRegistration(User user);

  boolean validateSymptom(User user);
}
