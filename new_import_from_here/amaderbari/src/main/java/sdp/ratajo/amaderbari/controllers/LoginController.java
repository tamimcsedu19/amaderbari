package sdp.ratajo.amaderbari.controllers;

import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST )
	
	public String home(Model model,HttpServletRequest req) {
		logger.info("In the login controller");
		
		
		
		HttpSession curSession = req.getSession();
		
		String useremail = req.getParameter("useremail");
		String password = req.getParameter("password");
		System.out.println(useremail);
		if(useremail.equals("tamim.tamim1382@gmail.com"))
		{
				curSession.setAttribute("useremail", "tamim.tamim1382@gmail.com");
				System.out.println("setting session attribute");
		}
		System.out.println("in login");
		
		return "home";
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
		session.removeAttribute("useremail");
		System.out.println(session.getAttribute("useremail"));
		return "home";
	}

	
}
