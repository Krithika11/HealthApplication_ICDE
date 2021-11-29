package springmvc.dao;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Configuration;
import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

  @Autowired
  BasicDataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  public int register(User user) {
    String sql = "insert into USER_BASICINFO values(?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(),
            user.getEmail(), user.getAge(), user.getGender() });
  }

  public User validateUser(User login) {
    String sql = "select * from USER_BASICINFO where USER_NAME='" + login.getUsername() + "' and PASS_WORD='" + login.getPassword() + "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
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