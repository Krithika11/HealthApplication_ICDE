package springmvc.model;

import org.springframework.context.ApplicationListener;

import javax.validation.constraints.*;

public class User {


  @NotNull(message = "Please enter a username")
  @NotEmpty(message = "Please enter a username")
  @Size(min=2, max=30, message = "Username must be between 6 and 20 characters")
  private String username;

  @NotNull(message = "Please enter a password")
  @NotEmpty(message = "Please enter a password")
  @Size(min = 6, max = 20, message = "Password length must be between 6 and 20 characters")
  private String password;

  @Email
  @NotEmpty(message = "Please enter your e-mail ID")
  private String email;

  @NotNull(message = "Please enter your age")
  @NotEmpty(message = "Please enter your age")
  @Digits(integer = 3, fraction = 0, message = "please enter an age above 0 and below 100")
  @Min(value = 1, message = "Please enter an age above 0")
  @Max(value = 100,message = "Please enter an age below 100")
  private int age;

  @NotEmpty(message = "Please select an option")
  private String gender;

  private String symptom;

  public String getSymptom() {
    return symptom;
  }

  public void setSymptom(String symptom) {
    this.symptom = symptom;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    System.out.println("username: " + username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() { return age; }

  public void setAge(int age) { this.age = age; }

  public String getGender() { return gender; }

  public void setGender(String gender) { this.gender = gender; }
}
