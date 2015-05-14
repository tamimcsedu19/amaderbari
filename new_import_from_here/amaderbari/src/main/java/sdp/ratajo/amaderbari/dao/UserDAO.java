package sdp.ratajo.amaderbari.dao;
import java.util.List;

/** This interface is for searching Flats have methods for searhing flats **/
import sdp.ratajo.amaderbari.dto.*;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import javax.sql.DataSource;
public interface UserDAO {
	
	public void save(User user);
	public void delete(int id);
	//public void update()
	
}
