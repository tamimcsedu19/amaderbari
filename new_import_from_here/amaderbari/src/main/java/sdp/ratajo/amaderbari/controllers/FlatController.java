package sdp.ratajo.amaderbari.controllers;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
		address = addressDao.getAddress(address);
		request.getSession().setAttribute("address", address);
		
		System.out.println("in save all" + address.getAddressId());
		
		Flat flat = (Flat) request.getSession().getAttribute("flat");
		flat.setAddressId(address.getAddressId());
		flat = flatDao.getFlat(flat);
		request.getSession().setAttribute("flat", flat);
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
	public ModelAndView addImage(HttpServletRequest request, ModelAndView modelAndView) {
		
		//String in = (String) request.getAttribute("image1");
		String in = "/home/jony/Pictures/phpmyadmin.png";
		System.out.println(in);
		
		Integer flatId = ((Flat) request.getSession().getAttribute("flat")).getFlatId();
		
		String out = "/home/jony/amaderbari/new_import_from_here/amaderbari/src/main/resources/images/" + flatId + "_.png";
		write(in, out);
		
		modelAndView.setViewName("success");
		System.out.println("Post method of AddImage controller is executed");
		return modelAndView;
	}
	
	void write(String inpath, String outpath){
			BufferedImage bImage = null;
			try {
				  File initialImage = new File(inpath);
				  bImage = ImageIO.read(initialImage);
				  ImageIO.write(bImage, "png", new File(outpath));

			} catch (Exception e) {
				  System.out.println("Exception occured :" + e.getMessage());
			}
			
			System.out.println("Images were written succesfully.");
	}
	
	@RequestMapping(value = "showflats", method = RequestMethod.GET)
	public ModelAndView showUserFlats(ModelAndView model,HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		model.addObject("flats",session.getAttribute("flats"));
		model.setViewName("showflats");
		System.out.print("in showflats");
		return model;
		
	}

}
