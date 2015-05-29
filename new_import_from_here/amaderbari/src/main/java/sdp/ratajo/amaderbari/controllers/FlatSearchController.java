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
		
		System.out.println("Searching by Address");
		
		String country = (String)req.getParameter("country");
		String addressArgument1 = (String)req.getParameter("addressArgument1");
		String addressArgument2 = (String)req.getParameter("addressArgument2");
		
		//AddressLabel addressLabel = getLabel(address.getCountry());
		// Get address ids from the address
				
		List<Integer> addressIds = getAddressIds(country, addressArgument1, addressArgument2);
		if(addressIds.size() == 0) System.out.println("no address id");
		else System.out.print(addressIds.get(0));
				
		// Get flat ids from the address ids
		List<Flat> flatIds = null;
//				if(addressIds.size()>0) flatIds = getFlatIds(addressIds);
//				else System.out.println("NO FLAT ID");
		
		
		
		
		
		System.out.println("IN Search CONTROLLER -> " + country + " " + addressArgument1 + " " + addressArgument2);
		
		FlatSearcher flatSearcher = new FlatSearcherBy3parameter(country, addressArgument1, addressArgument2);
		List<Flat> flats = flatSearcher.search();
		
		modelAndView.setViewName("showflats");
		return modelAndView;
	}
	
	
	private List<Integer> getAddressIds(String country, String addressArgument1, String addressArgument2)
	{	
		String sql = "SELECT * FROM Addresses" +
				" Where Country = '" + country +
				"' and AddressArgument1 ='" + addressArgument1 +
				"' and AddressArgument2='" + addressArgument2 +"'";
		
		List<Address> addresses = (List<Address>) (Object) addressDao.search(sql);
		List<Integer> addressIds = new ArrayList<Integer>();
		for(Address address: addresses){
			System.out.println("IN controller " + address.getAddressId());
			addressIds.add(address.getAddressId());
		}
		return addressIds;
	}
	
	private List<Flat> getFlatIds(List<String> addressIds) {
		
		String sqltemplate = "SELECT * FROM Flats  WHERE addressId ='";
		
		// get the flats from the adressIds
		List<Flat> flats = new ArrayList<Flat>();
		for(String addressId : addressIds){
			String sql = sqltemplate + addressId + "'";
			flats.addAll((List<Flat>) (Object)flatDao.search(sql));
		}
		
		return flats;
	}
	
}
