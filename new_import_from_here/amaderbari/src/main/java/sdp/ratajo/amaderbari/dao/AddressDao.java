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
	public Object get(String id){
		System.out.println("okkkkkkkkkk");
		String sql = "SELECT * FROM Addresses WHERE labelId=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<Address>()
		{
			@Override
			public Address extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				 if (rs.next()) {
					 
					 Address address = new Address();
					 address.setAddressId(rs.getInt(0));
					 address.setLabelId(rs.getInt(1));
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
	
	public Address getAddress(final Address preAddress){
		String sql = "SELECT * FROM Addresses" +
				" Where Country = '" + preAddress.getCountry() +
				"' and AddressArgument1 ='" + preAddress.getAddressArgument1() +
				"' and AddressArgument2='" + preAddress.getAddressArgument2() + "'";
		
		List<Object> objects = new ArrayList<Object>();
		 
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Address object = new Address();
			
			object.setAddressId((Integer)row.get("AddressId"));
			object.setLabelId((Integer)row.get("LabelId"));
			object.setCountry((String)row.get("Country"));
			object.setAddressArgument1((String)row.get("AddressArgument1"));
			object.setAddressArgument2((String)row.get("AddressArgument2"));
			object.setExtraAddressArgument((String)row.get("ExtraAddressArgument"));
			 
			objects.add(object);
		}
		if(objects.size() == 0)
		{
			save(preAddress);
			return getAddress(preAddress);
		}

		else return (Address)objects.get(0);
	}
	

	public List<Object> search(String sql) {
		System.out.println("okkkkkkkkkk");
		List<Object> objects = new ArrayList<Object>();
		 
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Address object = new Address();
			
			object.setAddressId((Integer)row.get("AddressId"));
			object.setLabelId((Integer)row.get("LabelId"));
			object.setCountry((String)row.get("Country"));
			object.setAddressArgument1((String)row.get("AddressArgument1"));
			object.setAddressArgument2((String)row.get("AddressArgument2"));
			object.setExtraAddressArgument((String)row.get("ExtraAddressArgument"));
			 
			objects.add(object);
		}
		return  objects;
	}
	
	public void check(){
		System.out.println("okkkkkkkkkk");
	}
}
