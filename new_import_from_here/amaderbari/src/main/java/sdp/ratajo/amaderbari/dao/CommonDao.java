package sdp.ratajo.amaderbari.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class CommonDao {
	private volatile static JdbcTemplate jdbcTemplate;
	public CommonDao(DataSource dataSource){
		if(jdbcTemplate == null){
			synchronized (dataSource) {
				if(jdbcTemplate == null){
					jdbcTemplate = new JdbcTemplate(dataSource);
				}
			}
		}
	}
	abstract boolean save(Object obj);
	abstract boolean update(Object obj);
	abstract boolean delete(String id);
	abstract Object get(String id);
}
