package sdp.ratajo.amaderbari.controllers;

import java.util.List;
import java.util.Locale;

import sdp.ratajo.amaderbari.dao.search.FlatSearcher;
import sdp.ratajo.amaderbari.dto.addresspack.*;
import sdp.ratajo.amaderbari.dto.flatpack.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sdp.ratajo.amaderbari.bll.*;
@Controller
public class FlatSearchController {
	@Autowired
	FlatSearcher searcher;
	@Autowired
	AddressFactory adfac;
	@RequestMapping(value = "searchFlat", method = RequestMethod.GET)
	public ModelAndView houses(ModelAndView modelAndView, HttpServletRequest req) {
	
		String country = "Bangladesh";
		String col1val = (String)req.getParameter("col1val");
		String col2val = (String)req.getParameter("col2val");
		System.out.println(country + " " + col1val + " " + col2val);
		
		
		
		List<Flat> foundFlats = searcher.search(country,col1val,col2val);
		
		modelAndView.setViewName("showflats");
		
		
		return modelAndView;

	}
	
	
}
