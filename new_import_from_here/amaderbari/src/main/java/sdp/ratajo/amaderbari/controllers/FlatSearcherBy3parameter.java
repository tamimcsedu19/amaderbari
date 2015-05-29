package sdp.ratajo.amaderbari.controllers;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.tags.EscapeBodyTag;

import com.mysql.jdbc.PreparedStatement;

import sdp.ratajo.amaderbari.config.MvcConfiguration;
import sdp.ratajo.amaderbari.dao.AddressDao;
import sdp.ratajo.amaderbari.dao.AddressLabelDao;
import sdp.ratajo.amaderbari.dao.FlatDao;
import sdp.ratajo.amaderbari.dto.*;
import sdp.ratajo.amaderbari.dto.flatpack.*;
import sdp.ratajo.amaderbari.dto.addresspack.*;

public class FlatSearcherBy3parameter implements FlatSearcher {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private AddressLabelDao addressLabelDao;
	@Autowired
	private AddressDao addressDao;
	@Autowired
	private FlatDao flatDao;
	
	Address address;
	
	public FlatSearcherBy3parameter(String country, String addressArgument1, String addressArgument2){
		address = new Address();
		address.setCountry(country);
		address.setAddressArgument1(addressArgument1);
		address.setAddressArgument2(addressArgument2);
	}
	

	@Override
	public List<Flat> search() {
	
		System.out.println("Searching by Address");
		
		if(addressDao == null) System.out.println("null found");
		else System.out.println("null not found");
		
		//AddressLabel addressLabel = getLabel(address.getCountry());
		// Get address ids from the address
		
		List<String> addressIds = getAddressIds();
		if(addressIds.size() == 0) System.out.println("no address id");
		else System.out.print(addressIds.get(0));
		
		// Get flat ids from the address ids
		List<Flat> flatIds = null;
//		if(addressIds.size()>0) flatIds = getFlatIds(addressIds);
//		else System.out.println("NO FLAT ID");
		
		return flatIds;
	}

	private AddressLabel getLabel(String country)
	{
		String sql = "SELECT addressArgument1, addressArgument2 FROM AddressLabels WHERE Country='"+country+"'";
		
		Object obj = null; 
		System.out.println("entering search");
		addressLabelDao.search(sql);
		if(obj == null) return null;
		else{
			List<AddressLabel> addressLabels = (List<AddressLabel>) obj;
			return addressLabels.get(0);
		}
	}
	
	
	private List<String> getAddressIds()
	{	
		String sql = "SELECT AddressId FROM Addresses" +
				" Where Country = " + address.getCountry() +
				" and AddressArgument1 =" + "='" + address.getAddressArgument1() +"'"+
				" and AddressArgument2"  + "='" + address.getAddressArgument2() +"'";
		
		List<String> addressIds = new ArrayList<String>(); //(List<String>) (Object)
		if(addressDao == null) System.out.print("null found");
		else addressDao.check();
		return addressIds;
	}
	
	private List<Flat> getFlatIds(List<String> addressIds) {
		
		String sqltemplate = "SELECT * FROM Flats"+
				" WHERE addressId ='";
		
		// get the flats from the adressIds
		List<Flat> flats = null;
		for(String addressId : addressIds){
			String sql = sqltemplate + addressId + "'";
			flats.addAll((List<Flat>) (Object)flatDao.search(sql));
		}
		
		return flats;
	}

}
