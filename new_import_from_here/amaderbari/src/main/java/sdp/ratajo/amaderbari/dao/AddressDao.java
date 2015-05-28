package sdp.ratajo.amaderbari.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.addresspack.AddressLabel;

public class AddressDao extends CommonDao {

	@Override
	public boolean save(Object obj) {
		Address address = (Address) obj;
		String sql = "INSERT INTO Addresses (addressId, labelId, country, addressArgument1,"
				+ " addressArgument2, extraAddressArgument)"
            	+ " VALUES (?, ?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, address.getAddressId(), address.getLabelId(), address.getCountry(),
					address.getAddressArgument1(), address.getAddressArgument2(),
					address.getExtraAddressArgument());
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Object obj) {
		Address address = (Address) obj;
		String sql = "UPDATE Addresses SET addressId=?, labelId=?, country=?, addressArgument1=?,"
				+ "addressArgument2=?, extraAddressArgument=?)";
		try{
			jdbcTemplate.update(sql, address.getAddressId(), address.getLabelId(), address.getCountry(),
					address.getAddressArgument1(), address.getAddressArgument2(),
					address.getExtraAddressArgument());
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	boolean delete(String id) {
		String sql = "DELETE FROM Addresses WHERE addressId=?";
		try{
			jdbcTemplate.update(sql, id);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Object get(String id) {
		System.out.println("okkkkkkkkkk");
		String sql = "SELECT * FROM Addresses WHERE addressId=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<Address>()
		{
			@Override
			public Address extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				 if (rs.next()) {
					 
					 Address address = new Address();
					 address.setAddressId(rs.getLong(0));
					 address.setLabelId(rs.getLong(1));
					 address.setCountry(rs.getString(2));
					 address.setAddressArgument1(rs.getString(3));
					 address.setAddressArgument2(rs.getString(4));
					 address.setExtraAddressArgument(rs.getString(5));
					
					 return address;
				 }
				return null;
			}	
		}, id);
	}

	public List<Object> search(String sql) {
		System.out.println("okkkkkkkkkk");
		List<Object> objects = new ArrayList<Object>();
		 
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Address object = new Address();
			
			object.setAddressId((Long)row.get(0));
			object.setLabelId((Long)row.get(1));
			object.setCountry((String)row.get(2));
			object.setAddressArgument1((String)row.get(3));
			object.setAddressArgument2((String)row.get(4));
			object.setExtraAddressArgument((String)row.get(5));
			 
			objects.add(object);
		}
		return  objects;
	}
	
	public void check(){
		System.out.println("okkkkkkkkkk");
	}
}
