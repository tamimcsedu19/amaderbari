package sdp.ratajo.amaderbari.controllers;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	
	public String home( Model model,HttpServletRequest req) {
		logger.info("In the login controller");
		
		
		
		HttpSession curSession = req.getSession();
		curSession.setAttribute("username", "tamim");
		System.out.println("in login");
		
		return "success";
	}
	@RequestMapping(value = "addflat", method = RequestMethod.GET)
	public String h()
	{
		return "addFlat";
	}

	
}
