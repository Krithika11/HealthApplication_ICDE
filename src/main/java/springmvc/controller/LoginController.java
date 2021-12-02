package springmvc.controller;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springmvc.email.JavaMail;
import springmvc.model.User;
import springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@SessionAttributes("login")
public class LoginController {

  @Autowired
  UserService userService;

  @Autowired
  ApplicationEventPublisher eventPublisher;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new User());

    return mav;
  }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") User users, Map<String, Object> model){
    ModelAndView mav = null;

    User user = userService.validateUser(users);
    if (null != user) {
      mav = new ModelAndView("profileInformation");
      mav.addObject("login",user);
    } else {
      mav = new ModelAndView("login");
      mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }
  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public ModelAndView goResultsPage(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("login") User user, BindingResult result,
                              Map<String, Object> model) throws MessagingException {
    ModelAndView mav = null;

    boolean error = userService.validateSymptom(user);

    if(error) {
      mav = new ModelAndView("profileInformation", "login", user);
      mav.addObject("message", "Please enter a Symptom");
    }
    else {
      mav = new ModelAndView("results_page");
      mav.addObject("login",user);

      JavaMail.sendMail(user);
      if (result.hasErrors()) {
        // form validation error
        System.out.println("Error in register page");
      }
    }
    return mav;
  }

  @RequestMapping(value = "/profile", method = { RequestMethod.POST, RequestMethod.GET})
  public ModelAndView profilePage(HttpServletRequest request, HttpServletResponse response,
                                  @ModelAttribute("login") User user) {


        ModelAndView mav = new ModelAndView("profileInformation");
        mav.addObject("login", user);
    return mav;
  }

}
