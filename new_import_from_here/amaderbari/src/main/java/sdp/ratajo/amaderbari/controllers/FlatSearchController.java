package sdp.ratajo.amaderbari.controllers;

import java.util.Locale;
import sdp.ratajo.amaderbari.dto.addresspack.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sdp.ratajo.amaderbari.dao.FlatSearcher;

@Controller
public class FlatSearchController {
	@Autowired
	FlatSearcher searcher;
	@RequestMapping(value = "searchFlat", method = RequestMethod.GET)
	public String houses(Model model,HttpServletRequest req) {
	
		
		String division = (String)req.getParameter("division");
		String city    	= (String)req.getParameter("city");
		model.addAttribute("division", division);
		model.addAttribute("city",city);
		System.out.println(division +" "+city);
		return "flats";

	}
	
	
}
