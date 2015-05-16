package sdp.ratajo.amaderbari.userpack.dao;

import java.util.List;



/** This interface is for searching Flats have methods for searhing flats **/
import sdp.ratajo.amaderbari.dto.*;
import sdp.ratajo.amaderbari.userpack.dto.UserForm;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import javax.sql.DataSource;
public interface UserDAO {
	
	public void save(UserForm user);
	public void delete(String email);
	public void update(String email,String attribute,String value);
	
}
