package sdp.ratajo.amaderbari.dao.search;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.tags.EscapeBodyTag;

import sdp.ratajo.amaderbari.dto.*;
import sdp.ratajo.amaderbari.dto.flatpack.*;
import sdp.ratajo.amaderbari.dto.addresspack.*;

/*
 * how about this
 * 1. country      ?      ?
 * 2. bangladesh division ?
 * 3. bangladesh dhaka    city
 * 4. bangladesh dhaka    uttara
 * 5. search / add more specific area(add more field)
 * 
 */

public class FlatSearcherBy3parameter implements FlatSearcher {
	private JdbcTemplate jdbcTemplate;

	public FlatSearcherBy3parameter(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Flat> search(String ...strings) {
	
		System.out.println("I am implementing the searching of Flats by city and division");
		
		String country = strings[0];
		
		/**
		 * strings[0] is country
		 * strings[1] is colval1 i.e Division value such as 'Dhaka' and strings[2] is colval2 i.e city value like 'Uttara'
		 */
		Address addr = new Address();
		addr.setCountry(strings[0]);
		addr.setAddressArgument1(strings[1]);
		addr.setAddressArgument2(strings[2]);
		
		AddressLabel addressLabel = new AddressLabel();
		// Get address ids from the address
		List<String> addressIds = getAddressIds(addr);
		System.out.print(addressIds.get(0));
		
		// Get flat ids from the address ids
		List<Flat> flatIds = null;
		if(addressIds.size()>0) flatIds = getFlatIds(addressIds);
		else System.out.println("NO FLAT ID");
		
		return flatIds;
	}

	private AddressLabel getColumnLabels(String country)
	{
		
		String sql = "SELECT Column1, Column2 FROM CountryColumnMapper WHERE Country='"+country+"'";
		List<AddressLabel> addresslabel = jdbcTemplate.query(sql,new RowMapper<AddressLabel>() {
			 
	        @Override
	        public AddressLabel mapRow(ResultSet rs, int rowNum) throws SQLException 
	        {
	        	AddressLabel Countrylabel = new AddressLabel();
	        	
	        	Countrylabel.setCountry(rs.getString(0));
	        	Countrylabel.setAddressArgument1(rs.getString(1));
	        	Countrylabel.setAddressArgument2(rs.getString(2));
	            return Countrylabel;
	        }
	 
	    });
		
		// how ??
		if(addresslabel.size() == 0)
		{
			AddressLabel BangladeshLabels =  new AddressLabel();
			BangladeshLabels.setAddressArgument1("division");
			BangladeshLabels.setAddressArgument2("city");
			BangladeshLabels.setCountry("Bangladesh");
			return BangladeshLabels;
		}
		
//		if(addresslabel.size() == 0){
//			System.out.println("NO COUNTRY LABEL FOUND FOR THE SPECEFIC COUNTRY");
//			return null;
//		}
		
		return addresslabel.get(0);
	}
	
	
	private List<String> getAddressIds(Address addr)
	{
		String tablename = "Addresses";
		
		String sql = "SELECT addressId FROM "+tablename+
				" WHERE getAddressArgument1" + "='" + addr.getAddressArgument1() +"'"+
				" and getAddressArgument2"  + "='" + addr.getAddressArgument2() +"'";
		
		List<String> addressId=jdbcTemplate.query(sql, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				if(rs.next()) return rs.getString("addressId");
				else return null;
			
			}
		});
		return addressId;
	}
	
	private List<Flat> getFlatIds(List<String> addressIds) {
		String tablename = "Flats";
		
		String sqltemplate = "SELECT * FROM "+ tablename +
				" WHERE addressId" + "='";
		
		// get the flats from the adressIds
		List<Flat> flats = null;
		for(String addressId : addressIds){
			String sql = sqltemplate + addressId + "'";
			flats.addAll(jdbcTemplate.query(sql, new RowMapper<Flat>() {
				@Override
				public Flat mapRow(ResultSet rs, int rowNum) throws SQLException {
					if(rs.next()){
						return new Flat(rs.getLong(0), rs.getLong(1), rs.getLong(2),
								rs.getLong(3), rs.getString(4), rs.getString(5),
								rs.getString(6), rs.getString(7), rs.getDouble(8));
					}
					return null;
				}
			}));
			
		}
		
		return flats;
	}

}
