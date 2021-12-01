package springmvc.dao;

import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  private String username = null;
  private String password = null;
  private String gender = null;
  private String email = null;
  private int age = 0;
  public int register(User user) {
    int result =0;
//    String sql = "insert into USER_BASICINFO values(?,?,?,?,?)";
//
//    return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(),
//            user.getEmail(), user.getAge(), user.getGender() });
      username = user.getUsername();
      password = user.getPassword();
      gender = user.getGender();
      email = user.getEmail();
      age = user.getAge();
      user.setUsername(username);
      user.setUsername(password);
      user.setGender(gender);
      user.setEmail(email);
      user.setAge(age);
    return result;
  }

  public User validateUser(User login) {
//    String sql = "select * from USER_BASICINFO where USER_NAME='" + login.getUsername() + "' and PASS_WORD='" + login.getPassword() + "'";
//    List<User> users = jdbcTemplate.query(sql, new UserMapper());
//
//    return users.size() > 0 ? users.get(0) : null;
    User user = new User();
//    List <User> users1 = new ArrayList<>();
    username = "Admin";
    password = "admin123";
    String username1 = "Geeth";
    String password1 = "geeth123";

    if(login.getUsername().equals(username) && login.getPassword().equals(password)) {
        user.setUsername(login.getUsername());
        user.setPassword(login.getPassword());
        user.setEmail("Admin");
        user.setGender("Male");
        user.setAge(25);
    }
    else if(login.getUsername().equals(username1) && login.getPassword().equals(password1)) {
        user.setUsername(login.getUsername());
        user.setPassword(login.getPassword());
        user.setEmail("geeth@gmail.com");
        user.setGender("Female");
        user.setAge(35);
    }
      else {
        user = null;
    }
    return user;
  }

  public boolean validateUserRegistration(User register) {
    boolean error = false;
    if(register.getUsername().isEmpty() || register.getPassword().isEmpty() ||
            register.getEmail().isEmpty() || register.getGender().isEmpty() ||
            register.getAge()==0)
       error = true;
    return error;

  }

  public boolean validateSymptom(User symptom) {
    boolean error = false;
    if(symptom.getSymptom().isEmpty())
      error = true;
    return error;

  }

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUsername(rs.getString("USER_NAME"));
    user.setPassword(rs.getString("PASS_WORD"));
    user.setEmail(rs.getString("EMAIL"));
    user.setGender(rs.getString("GENDER"));
    user.setAge(rs.getInt(4));

    return user;
  }
}