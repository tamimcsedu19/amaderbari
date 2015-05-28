package sdp.ratajo.amaderbari.controllers;

import java.util.List;
import java.util.Locale;

import sdp.ratajo.amaderbari.config.MvcConfiguration;
import sdp.ratajo.amaderbari.dao.search.FlatSearcher;
import sdp.ratajo.amaderbari.dao.search.FlatSearcherBy3parameter;
import sdp.ratajo.amaderbari.dto.addresspack.*;
import sdp.ratajo.amaderbari.dto.flatpack.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import sdp.ratajo.amaderbari.bll.*;
@Controller
public class FlatSearchController extends MvcConfiguration {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
    }
	
	@RequestMapping(value = "searchFlat", method = RequestMethod.GET)
	public ModelAndView houses(ModelAndView modelAndView, HttpServletRequest req) {
		String country = (String)req.getParameter("country");
		String addressArgument1 = (String)req.getParameter("addressArgument1");
		String addressArgument2 = (String)req.getParameter("addressArgument2");
		
		System.out.println("IN CONTROLLER -> " + country + " " + addressArgument1 + " " + addressArgument2);
		
		FlatSearcher flatSearcher = new FlatSearcherBy3parameter(country, addressArgument1, addressArgument2);
		List<Flat> foundFlats = flatSearcher.search();
		
		modelAndView.setViewName("showflats");
		return modelAndView;
	}
}
