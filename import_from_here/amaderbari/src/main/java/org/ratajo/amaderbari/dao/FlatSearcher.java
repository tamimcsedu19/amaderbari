package org.ratajo.amaderbari.dao;
import java.util.List;

/** This interface is for searching Flats have methods for searhing flats **/
import org.ratajo.amaderbari.dto.*;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import javax.sql.DataSource;
public interface FlatSearcher {
	
	public List<Flat> search(Address address);
}
