package sdp.ratajo.amaderbari.userpack.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.userpack.dto.User;

public class UserDAOImpl implements UserDAO{

	JdbcTemplate jdbcTemplate;
	public UserDAOImpl(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public void save(User user) {
		String sql = "INSERT INTO Users (email,first_name,last_name,password,national_id,contact_no,religion,occupation)"
                	+ " VALUES (?, ?, ?, ?,?,?,?,?)";
		jdbcTemplate.update(sql,user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getPassword(),user.getNational_id(),user.getContact_no()
							,user.getReligion(),user.getOccupation());
		
		
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE Users SET email=?,first_name=?,last_name=?,password=?,national_id=?,contact_no=?,religion,occupation=?)";
	jdbcTemplate.update(sql,user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getPassword(),user.getNational_id(),user.getContact_no()
						,user.getReligion(),user.getOccupation());
		
	}

	@Override
	public void delete(String email) {
		
		
	}
	@Override
	public User get(final String email) {
		
		String sql = "SELECT * FROM contact WHERE email=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<User>()
		{

			@Override
			public User extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				
				 if (rs.next()) {
					 User user = new User();
					 user.setFirst_name(rs.getString("first_name"));
					 user.setLast_name(rs.getString("last_name"));
					 user.setEmail(email);
					 user.setNational_id(rs.getString("national_id"));
					 user.setContact_no(rs.getString("contact_no"));
					 user.setReligion(rs.getString("religion"));
					 user.setOccupation(rs.getString("occupation"));
					 return user;
					 
				 }
				return null;
			}
				
		},email);
		
		
		
		
	}
	

	
}
