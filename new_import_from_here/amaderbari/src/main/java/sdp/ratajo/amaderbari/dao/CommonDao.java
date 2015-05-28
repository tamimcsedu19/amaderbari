package sdp.ratajo.amaderbari.dao;





import java.util.List;

import javax.inject.Singleton;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class CommonDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	abstract boolean save(Object obj);
	abstract boolean update(Object obj);
	abstract boolean delete(String id);
	abstract Object get(String id);
}
