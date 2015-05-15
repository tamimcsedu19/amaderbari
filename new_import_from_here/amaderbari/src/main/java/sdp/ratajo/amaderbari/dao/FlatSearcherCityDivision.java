package sdp.ratajo.amaderbari.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import sdp.ratajo.amaderbari.dto.flatpack.*;
import sdp.ratajo.amaderbari.dto.addresspack.*;

public class FlatSearcherCityDivision implements FlatSearcher {
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Flat> search(Address addr) {
	
		System.out.println("I am implementing the searching of Flats by city and division");
		return null;
	}

}
