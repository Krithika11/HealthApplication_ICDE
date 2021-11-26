package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springmvc.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class HomeController {

//    @RequestMapping(value = "/profile", method = RequestMethod.GET)
//    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView mav = new ModelAndView("profileInformation");
//        mav.addObject("login", new User());
//
//        return mav;
//    }

//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String goResultsPage(@ModelAttribute("searchForm") User user, BindingResult result,
//                                Map<String, Object> model) {
//
//        if (result.hasErrors()) {
//
//            // form validation error
//            System.out.println("Error in symptom search action");
//            return "profileInformation";
//            //Might have to create a session to retreive the user details
//            // in the home page after user clicks Submit without entering a symptom and
//            // also while user switches to home page from results page
//        }
//        return "results_page";
//    }
}
