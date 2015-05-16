package sdp.ratajo.amaderbari.bll;
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
	public List<Flat> search(Address addr) {
	
		System.out.println("I am implementing the searching of Flats by city and division");
		String country = addr.getCountry(); // Gets The countryname
		
		//Gets the column labels for that particular Country
		CountryColumnLabels countryColumnLabel = getColumnLabels(country);
		
		// Get address ids from the address
		List<String> addressIds = getAddressIds(countryColumnLabel, addr);
		System.out.print(addressIds.get(0));
		
		// Get flat ids from the address ids
		List<Flat> flatIds = null;
		if(addressIds.size()>0) flatIds = getFlatIds(addressIds);
		else System.out.println("NO FLAT ID");
		
		return flatIds;
	}

	private CountryColumnLabels getColumnLabels(String country)
	{
		
		String sql = "SELECT Column1, Column2 FROM CountryColumnMapper WHERE Country='"+country+"'";
		List<CountryColumnLabels> clabels = jdbcTemplate.query(sql,new RowMapper<CountryColumnLabels>() {
			 
	        @Override
	        public CountryColumnLabels mapRow(ResultSet rs, int rowNum) throws SQLException 
	        {
	        	CountryColumnLabels Countrylabel = new CountryColumnLabels();
	        	
	        	Countrylabel.setCountry(rs.getString(0));
	        	Countrylabel.setColumn1Label(rs.getString(1));
	        	Countrylabel.setColumn2Label(rs.getString(2));
	            return Countrylabel;
	        }
	 
	    });
		
		// how ??
		if(clabels.size() == 0)
		{
			CountryColumnLabels BangladeshLabels =  new CountryColumnLabels();
			BangladeshLabels.setColumn1Label("division");
			BangladeshLabels.setColumn2Label("city");
			BangladeshLabels.setCountry("Bangladesh");
			return BangladeshLabels;
		}
		
//		if(clabels.size() == 0){
//			System.out.println("NO COUNTRY LABEL FOUND FOR THE SPECEFIC COUNTRY");
//			return null;
//		}
		
		return clabels.get(0);
	}
	
	
	private List<String> getAddressIds(CountryColumnLabels clabels, Address addr)
	{
		String tablename = clabels.getCountry()+"Address";
		
		String sql = "SELECT addressId FROM "+tablename+
				" WHERE "+clabels.getColumn1Label()+"='"+addr.getAddressArgument1()+"'"+
				" and "  +clabels.getColumn2Label()+"='"+addr.getAddressArgument2()+"'";
		
		List<String> addressId=jdbcTemplate.query(sql, new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return rs.getString("addressId");
			
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
					Flat  aflat = new Flat();
					
					aflat.setFlat_id(rs.getString(0));
					aflat.setAddressId(rs.getString(1));
					aflat.setType(rs.getString(2));
					aflat.setOwner_national_id(rs.getString(3));
					aflat.setRenter_national_id(rs.getString(4));
					aflat.setMap_url(rs.getString(5));
					aflat.setImage_id(rs.getString(6));
					aflat.setSquare_foot(rs.getString(7));
					aflat.setRent(rs.getDouble(8));
					aflat.setExtraData(rs.getString(9));
					
					return aflat;
				}
			}));
		}
		
		return flats;
	}

}
