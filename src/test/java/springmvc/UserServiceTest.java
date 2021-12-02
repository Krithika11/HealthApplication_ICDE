package springmvc;

import springmvc.model.User;
import springmvc.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
public class UserServiceTest {

  @Autowired
  private UserService userService;

  @Test
  public void testRegister() {
    User user = new User();
    user.setUsername("Admin");
    user.setPassword("admin");
    user.setAge(20);
    user.setGender("Male");
    user.setEmail("admin@gmail.com");

    int result = userService.register(user);
    Assert.assertEquals(1, result);
  }
  @Test
  public void testValidateRegister() {
    User user = new User();
    user.setUsername("Admin");
    user.setPassword("admin");
    user.setAge(20);
    user.setGender("Male");
    user.setEmail("admin@gmail.com");

    boolean result = userService.validateUserRegistration(user);
    Assert.assertEquals(false, result);
  }

  @Test
  public void testValidateRegisterError() {
    User user = new User();
    user.setUsername("");
    user.setPassword("admin");
    user.setAge(20);
    user.setGender("Male");
    user.setEmail("admin@gmail.com");

    boolean result = userService.validateUserRegistration(user);
    Assert.assertEquals(true, result);
  }

  @Test
  public void testValidateUser() {
    User login = new User();
    login.setUsername("Admin");
    login.setPassword("admin");

    User user = userService.validateUser(login);
    Assert.assertEquals("Admin", user.getUsername());
  }

  @Test
  public void testErrorForValidateSymptom() {
    User login = new User();
    login.setSymptom("Fever");

    boolean user = userService.validateSymptom(login);
    Assert.assertEquals(false, user);
  }

  @Test
  public void testSuccessForValidateSymptom() {
    User login = new User();
    login.setSymptom("");

    boolean user = userService.validateSymptom(login);
    Assert.assertEquals(true, user);
  }
}
