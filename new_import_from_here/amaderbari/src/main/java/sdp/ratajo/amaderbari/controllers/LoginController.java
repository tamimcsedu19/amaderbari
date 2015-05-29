package sdp.ratajo.amaderbari.controllers;

import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sdp.ratajo.amaderbari.dto.flatpack.Flat;
import sdp.ratajo.amaderbari.userpack.dao.UserDAO;
import sdp.ratajo.amaderbari.userpack.dto.User;

@Controller
public class LoginController {
	@Autowired
	UserDAO userDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST )
	
	public ModelAndView home(ModelAndView model,HttpServletRequest req) {
		logger.info("In the login controller");
		
		model.setViewName("home");
		
		HttpSession curSession = req.getSession();
		
		String useremail = req.getParameter("useremail");
		String password = req.getParameter("password");
		User user = userDAO.get(useremail,password);
		
		if(user == null)
		{
			model.addObject("error", "useremail or password Invalid");
		}
		else
		{
				curSession.setAttribute("user",user);
				List<Flat> flats = userDAO.getUserFlats(useremail);
				List<Addres>
				for(int i=0;i<flats.size();++i)
				{
					Flat flat = flats.get(i);
					
				}
				curSession.setAttribute("flats", flats);
				
				System.out.println("setting session attribute");
		}
		System.out.println("in login");
		
		return model;
	}
	@RequestMapping(value = "addflat", method = RequestMethod.GET)
	public String h()
	{
		return "addFlat";
	}
	@RequestMapping(value = "signout", method = RequestMethod.GET)
	public String signout(Model model,HttpServletRequest req) 
	{
		HttpSession session = req.getSession();
		session.removeAttribute("user");
		System.out.println(session.getAttribute("user"));
		return "home";
	}

	
}
