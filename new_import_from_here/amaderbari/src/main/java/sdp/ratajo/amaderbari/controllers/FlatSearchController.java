package sdp.ratajo.amaderbari.controllers;

import java.util.Locale;
import sdp.ratajo.amaderbari.dto.addresspack.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sdp.ratajo.amaderbari.bll.*;
@Controller
public class FlatSearchController {
	@Autowired
	FlatSearcher searcher;
	@Autowired
	AddressFactory adfac;
	@RequestMapping(value = "searchFlat", method = RequestMethod.GET)
	public String houses(Model model,HttpServletRequest req) {
	
		
		String country = "Bangladesh";
		String col1val = (String)req.getParameter("col1val");
		String col2val    	= (String)req.getParameter("col2val");
		Address addr = adfac.make(country, col1val, col2val);
		System.out.print(addr.addressVals.get(1));
		searcher.search(addr);
		
		
		return "showflats";

	}
	
	
}
