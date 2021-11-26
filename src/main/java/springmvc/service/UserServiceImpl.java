package springmvc.service;

import springmvc.dao.UserDao;
import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(User user) {
    return userDao.validateUser(user);
  }

  public boolean validateUserRegistration(User user) {
    return userDao.validateUserRegistration(user);
  }

  public boolean validateSymptom(User user) {
    return userDao.validateSymptom(user);
  }

}
