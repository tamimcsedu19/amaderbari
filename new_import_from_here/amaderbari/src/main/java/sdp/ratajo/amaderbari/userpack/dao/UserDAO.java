package sdp.ratajo.amaderbari.userpack.dao;

import java.util.List;




/** This interface is for searching Flats have methods for searhing flats **/
import sdp.ratajo.amaderbari.dto.*;
import sdp.ratajo.amaderbari.userpack.dto.User;
import sdp.ratajo.amaderbari.userpack.dto.UserForm;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import javax.sql.DataSource;
public interface UserDAO {
	
	public void save(User user) throws UserExistsException;
	public void update(User user);
	public void delete(String email);
	public User get(String email,String password);
	
}
