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
import sdp.ratajo.amaderbari.dto.flatpack.*;
@Controller
public class FlatController extends MvcConfiguration {
	@Autowired
	private FlatDao flatDao;
	
	@Autowired 
	private AddressDao addressDao;
	
	
	private void saveAll(HttpServletRequest request){
		//flatDao.save(flat);		
		//addressDao.save(address);
		
		Address address = (Address) request.getSession().getAttribute("address");
		System.out.println("In save all\n" + address);
		Integer addressId = addressDao.getId(address);
		System.out.println(addressId);
		if(addressId == 0){
			addressDao.save(address);
		}
		
		Flat flat = (Flat) request.getSession().getAttribute("flat");
		flat.setAddressId(addressId);
		Integer flatId = 0;
		
		
		
		
		
	}
	
	@RequestMapping(value = "addFlat", method = RequestMethod.GET)
	public ModelAndView addFlat(ModelAndView modelAndView, HttpServletRequest req) {
		return new ModelAndView("addFlat","flat", new Flat());

	}
	
	@RequestMapping(value = "addFlat", method = RequestMethod.POST)
	public ModelAndView addFlat(@Valid @ModelAttribute("flat")Flat flat, BindingResult result, ModelAndView modelAndView, HttpServletRequest request) {
		
		if(result.hasErrors()){
			return new ModelAndView("addFlat");
		}

		System.out.println("Post method of Addflat controller is executed");
		request.getSession().setAttribute("flat", flat);
		
		saveAll(request);
		
		return new ModelAndView("addImage","image", new sdp.ratajo.amaderbari.dto.flatpack.Image());
	}
	
	
	
	@RequestMapping(value = "addAddress", method = RequestMethod.GET)
	public ModelAndView addAddress(ModelAndView modelAndView, HttpServletRequest req) {
		return new ModelAndView("addAddress","address", new Address());
	}
	
	@RequestMapping(value = "addAddress", method = RequestMethod.POST)
	public ModelAndView addAddress(@Valid Address address , BindingResult result, ModelAndView modelAndView, HttpServletRequest request) {
		if(result.hasErrors()){
			return new ModelAndView("addAddress");
		}
		System.out.println("Post method of AddAddress controller is executed");
		request.getSession().setAttribute("address", address);
		return new ModelAndView("addFlat","flat", new Flat());
	}
	
	@RequestMapping(value = "addImage", method = RequestMethod.GET)
	public ModelAndView addImage(ModelAndView modelAndView, HttpServletRequest req) {
		return new ModelAndView("addImage","image", new sdp.ratajo.amaderbari.dto.flatpack.Image());
	}
	
	@RequestMapping(value = "addImage", method = RequestMethod.POST)
	public ModelAndView addImage(@Valid Image image , BindingResult result, ModelAndView modelAndView, HttpServletRequest request) {
		if(result.hasErrors()){
			return new ModelAndView("addImage");
		}
		System.out.println(image);
		addressDao.save(image);
		modelAndView.setViewName("success");
		System.out.println("Post method of AddImage controller is executed");
		return modelAndView;
	}
}
