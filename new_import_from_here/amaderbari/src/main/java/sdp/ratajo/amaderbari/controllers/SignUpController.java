package sdp.ratajo.amaderbari.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;
@Controller
public class SignUpController {


	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public ModelAndView showSignUpPage(ModelAndView modelAndView,HttpServletRequest req) {
		
		modelAndView.setViewName("signup");
		
		return modelAndView;

	}
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public ModelAndView signemUp(ModelAndView modelAndView,HttpServletRequest req) {
		
		modelAndView.setViewName("success");
		System.out.print("Post method of signup controller is executed");
		return modelAndView;

	}
}
