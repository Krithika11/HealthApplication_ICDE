package springmvc.controller;

import org.springframework.validation.BindingResult;
import springmvc.email.ConfirmMail;
import springmvc.model.User;
import springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());

    return mav;
  }

  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(@Valid @ModelAttribute("user") User user, BindingResult result) throws MessagingException {
    ModelAndView mav = null;

    boolean error = userService.validateUserRegistration(user);
    if(error) {
      mav = new ModelAndView("register", "user", user);
      mav.addObject("message", "Please fill in the details!");
    }
    else {
      userService.register(user);

      mav = new ModelAndView("register_success");
      mav.addObject("user",user);

      ConfirmMail.sendMail(user);
      if (result.hasErrors()) {
        // form validation error
        System.out.println("Error in register page");
      }
    }

    return mav;
  }

  @RequestMapping(value = "/confirm", method = RequestMethod.GET)
  public ModelAndView showEmailConfirmation(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("emailSuccess");
    mav.addObject("user", new User());

    return mav;
  }
}
