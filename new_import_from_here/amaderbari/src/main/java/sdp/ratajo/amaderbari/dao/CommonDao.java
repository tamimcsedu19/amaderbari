package sdp.ratajo.amaderbari.dao;

import javax.inject.Singleton;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class CommonDao {
	@Singleton
	protected JdbcTemplate jdbcTemplate;
	
	abstract boolean save(Object obj);
	abstract boolean update(Object obj);
	abstract boolean delete(String id);
	abstract Object get(String id);
}
