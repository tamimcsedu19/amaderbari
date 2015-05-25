package sdp.ratajo.amaderbari.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;
import sdp.ratajo.amaderbari.userpack.dao.UserDAO;
import sdp.ratajo.amaderbari.userpack.dto.User;
import sdp.ratajo.amaderbari.userpack.dto.UserForm;
@Controller
public class SignUpController extends WebMvcConfigurerAdapter {
	
	@Autowired
    private UserDAO userDAO;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
    }

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public ModelAndView showSignUpPage(ModelAndView modelAndView,HttpServletRequest req) {
		return new ModelAndView("signup","user",new UserForm());

	}
	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public ModelAndView signemUp(@Valid @ModelAttribute("user")UserForm user,BindingResult result,ModelAndView modelAndView,HttpServletRequest req) {
		
		if(result.hasErrors())
		{
			return new ModelAndView("signup");
		}
		userDAO.save(new User(user));
		modelAndView.setViewName("success");
		System.out.print("Post method of signup controller is executed");
		return modelAndView;

	}
}
