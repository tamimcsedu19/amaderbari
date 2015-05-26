package sdp.ratajo.amaderbari.controllers;

import java.awt.Image;

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

import sdp.ratajo.amaderbari.config.MvcConfiguration;
import sdp.ratajo.amaderbari.dao.AddressDao;
import sdp.ratajo.amaderbari.dao.FlatDao;
import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;
import sdp.ratajo.amaderbari.userpack.dto.User;
import sdp.ratajo.amaderbari.userpack.dto.UserForm;

@Controller
public class FlatController extends MvcConfiguration {
	@Autowired
	private FlatDao flatDao;
	
	@Autowired 
	private AddressDao addressDao;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
    }
	
	@RequestMapping(value = "addFlat", method = RequestMethod.GET)
	public ModelAndView addFlat(ModelAndView modelAndView, HttpServletRequest req) {
		return new ModelAndView("addFlat","flat", new Flat());

	}
	
	@RequestMapping(value = "addFlat", method = RequestMethod.POST)
	public ModelAndView addFlat(@Valid @ModelAttribute("flat")Flat flat, BindingResult result, ModelAndView modelAndView) {
		
		if(result.hasErrors()){
			return new ModelAndView("addFlat");
		}
		System.out.println(flat);
		flatDao.save(flat);
		modelAndView.setViewName("addAddress");
		System.out.println("Post method of Addflat controller is executed");
		return new ModelAndView("addAddress","address", new Address());
	}
	
	@RequestMapping(value = "addAddress", method = RequestMethod.GET)
	public ModelAndView addAddress(ModelAndView modelAndView, HttpServletRequest req) {
		return new ModelAndView("addAddress","address", new Address());
	}
	
	@RequestMapping(value = "addAddress", method = RequestMethod.POST)
	public ModelAndView addAddress(@Valid Address address , BindingResult result, ModelAndView modelAndView) {
		if(result.hasErrors()){
			return new ModelAndView("addAddress");
		}
		System.out.println(address);
		addressDao.save(address);
		modelAndView.setViewName("success");
		System.out.println("Post method of AddAddress controller is executed");
		return modelAndView;
	}
	
	@RequestMapping(value = "addImage", method = RequestMethod.POST)
	public ModelAndView addImage(@Valid Image image , BindingResult result, ModelAndView modelAndView) {
		if(result.hasErrors()){
			return new ModelAndView("addAddress");
		}
		System.out.println(image);
		addressDao.save(image);
		modelAndView.setViewName("success");
		System.out.println("Post method of AddImage controller is executed");
		return modelAndView;
	}
}
