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

public class FlatSearcherCityDivision implements FlatSearcher {
	
	private JdbcTemplate jdbcTemplate;
	

	public FlatSearcherCityDivision(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Flat> search(Address addr) {
	
		System.out.println("I am implementing the searching of Flats by city and division");
		String country = addr.getCountry(); // Gets The countryname
		CountryColumnLabels cur = getColumnLabels(country); //Gets the column labels for that particular Country
		/**
		 * This method gets the flat ID's which matches the city and division
		 */
		List<String> flatIds = getFlatIdsBylabels(cur,addr);
		System.out.print(flatIds.get(0));
		
		
		/** 
		 * Jony Please complete the method for searching of a Flat by ID
		 * From the tables CountryFlats(i.e BangladeshFlats)
		 * 
		 */
		
		
		
		
		
		
		
		
		return null;
	}
	
	
	public CountryColumnLabels getColumnLabels(String country)
	{
		
		String sql = "SELECT Column1,Column2 FROM CountryColumnMapper WHERE Country='"+country+"'";
		List<CountryColumnLabels> clabels = jdbcTemplate.query(sql,new RowMapper<CountryColumnLabels>() {
			 
	        @Override
	        public CountryColumnLabels mapRow(ResultSet rs, int rowNum) throws SQLException 
	        {
	        	CountryColumnLabels aCountry = new CountryColumnLabels();
	 
	            aCountry.setColumn1Label(rs.getString("Column1"));
	            aCountry.setColumn2Label(rs.getString("Column2"));
	            return aCountry;
	        }
	 
	    });
		
		if(clabels.size() == 0)
		{
			CountryColumnLabels BangladeshLabels =  new CountryColumnLabels();
			BangladeshLabels.setColumn1Label("division");
			BangladeshLabels.setColumn2Label("city");
			BangladeshLabels.setCountry("Bangladesh");
			return BangladeshLabels;
		}
		return clabels.get(0);
	  
	}
	
	
	public List<String> getFlatIdsBylabels(CountryColumnLabels clabels, Address addr)
	{
		String tablename = clabels.getCountry()+"Address";
		
		/**
		 * tamim please change your data base according the change
		 * for more info look up address and apartment class
		 * and must thnik about my comment
		 * 
		 * 
		 */
		
		String sql = "SELECT addressId FROM "+tablename+
				" WHERE "+clabels.getColumn1Label()+"='"+addr.getAddressArgument1()+"'"+
				" and "  +clabels.getColumn2Label()+"='"+addr.getAddressArgument2()+"'";
		List<String> flatIds=jdbcTemplate.query(sql, new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return rs.getString("FlatID");
			
			}
			
			
		});
		return flatIds;
		
	}

}
