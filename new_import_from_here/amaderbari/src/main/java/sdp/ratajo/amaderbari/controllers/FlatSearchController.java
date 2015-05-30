package sdp.ratajo.amaderbari.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import sdp.ratajo.amaderbari.config.MvcConfiguration;
import sdp.ratajo.amaderbari.controllers.*;
import sdp.ratajo.amaderbari.dao.AddressDao;
import sdp.ratajo.amaderbari.dao.AddressLabelDao;
import sdp.ratajo.amaderbari.dao.FlatDao;
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
public class FlatSearchController{
	@Autowired
	private AddressLabelDao addressLabelDao;
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private FlatDao flatDao;
	
	@RequestMapping(value = "addressFlatSearch", method = RequestMethod.GET)
	public ModelAndView addressFlatSearch(ModelAndView modelAndView, HttpServletRequest req) {
		
		System.out.println("Searching by Address...");
		
		String country = (String)req.getParameter("country");
		String addressArgument1 = (String)req.getParameter("addressArgument1");
		String addressArgument2 = (String)req.getParameter("addressArgument2");
		System.out.println("IN Search CONTROLLER -> " + country + " " + addressArgument1 + " " + addressArgument2);
		
		//AddressLabel addressLabel = getLabel(address.getCountry());
		// Get address ids from the address
				
		List<Address> addresses = getAddressIds(country, addressArgument1, addressArgument2);
		if(addresses.size() == 0) System.out.println("no address id");
		
				
		// Get flat ids from the address ids
		List<Flat> flats = new ArrayList<Flat>();
		List<Flat> tmps = new ArrayList<Flat>();
		List<Address> adds = new ArrayList<Address>();
		if(addresses.size()>0){
			for(Address address: addresses){
				System.out.println("addressId " + address.getAddressId());
				tmps = getFlatIds(address);
				for(int i=0; i<tmps.size(); i++){
					adds.add(address);
				}
				flats.addAll(tmps);
			}
		}
		
		for(Flat flat: flats){
			System.out.println(flat);
		}

		req.setAttribute("flats", flats);
		req.setAttribute("address", adds);
		modelAndView.addObject(addresses);
		//modelAndView.addObject(flats);
		
		modelAndView.setViewName("showflats");
		return modelAndView;
	}
	
	private List<Address> getAddressIds(String country, String addressArgument1, String addressArgument2)
	{	
		String sql = "SELECT * FROM Addresses" +
				" Where Country = '" + country +
				"' and AddressArgument1 ='" + addressArgument1 +
				"' and AddressArgument2='" + addressArgument2 +"'";
		
		List<Address> addresses = (List<Address>) (Object) addressDao.search(sql);
		return addresses;
	}
	
	private List<Flat> getFlatIds(Address address) {
		String sql = "SELECT * FROM Flats  WHERE addressId ='" + address.getAddressId() + "'";
		return (List<Flat>) (Object)flatDao.search(sql);
	}
}
