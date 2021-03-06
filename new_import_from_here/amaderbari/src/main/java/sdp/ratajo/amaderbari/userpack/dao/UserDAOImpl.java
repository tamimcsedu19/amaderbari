package sdp.ratajo.amaderbari.userpack.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import sdp.ratajo.amaderbari.dto.flatpack.Flat;
import sdp.ratajo.amaderbari.userpack.dto.User;

public class UserDAOImpl implements UserDAO{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(User user) throws UserExistsException
	{
		User us = get(user.getEmail(),user.getPassword());
		if(us != null)
			throw new UserExistsException();
		String sql = "INSERT INTO Users (email,first_name,last_name,password,national_id,contact_no,religion,occupation)"
                	+ " VALUES (?, ?, ?, ?,?,?,?,?)";
		jdbcTemplate.update(sql,user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getPassword(),user.getNational_id(),user.getContact_no()
							,user.getReligion(),user.getOccupation());
		
		
	}

	@Override
	public void update(User user) {
		String sql = "UPDATE Users SET email=?,first_name=?,last_name=?,password=?,national_id=?,contact_no=?,religion,occupation=?";
	jdbcTemplate.update(sql,user.getEmail(),user.getFirst_name(),user.getLast_name(),user.getPassword(),user.getNational_id(),user.getContact_no()
						,user.getReligion(),user.getOccupation());
		
	}

	@Override
	public void delete(String email) {
		
		
	}
	@Override
	public User get(final String email, final String password) {
		
		String sql = "SELECT * FROM Users WHERE email=?";
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
					 if(password.equals(rs.getString("password")))
							 return user;
					 else
						 return null;
					 
				 }
				return null;
			}
				
		},email);
		
		
		
		
	}
	
	public List<Flat> getUserFlats(String email)
	
	{
			
		String sql = "SELECT * FROM Flats WHERE OwnerEmail=?";
		return (List<Flat>) jdbcTemplate.query(sql, new RowMapper<Flat>() 
				{

					public Flat mapRow(ResultSet rs, int rowNum) throws SQLException
					{
				
						Flat flat = new Flat();
						flat.setFlatId(rs.getInt(1));
						flat.setAddressId(rs.getInt(2));
						flat.setExtraFlatDataId(rs.getInt(3));
						flat.setImageId(rs.getInt(4));
					 
						flat.setOwnerEmail(rs.getString(5));
						flat.setRenterEmail(rs.getString(6));
						flat.setMapUrl(rs.getString(7));
						flat.setSquareFoot(rs.getString(8));
						flat.setRent(Double.parseDouble(rs.getString(9)));
					 
					 return flat;
					}
				
				}	
		, email);
	}
		
		
	}
	

	

