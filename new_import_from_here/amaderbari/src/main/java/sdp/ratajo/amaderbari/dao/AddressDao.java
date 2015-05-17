package sdp.ratajo.amaderbari.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;

public class AddressDao extends CommonDao {

	public AddressDao(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public boolean save(Object obj) {
		Address address = (Address) obj;
		String sql = "INSERT INTO Adresses (addressId, labelId, country, addressArgument1,"
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
		String sql = "UPDATE Adresses SET addressId=?, labelId=?, country=?, addressArgument1=?,"
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
		String sql = "DELETE FROM Adresses WHERE addressId=?";
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
		String sql = "SELECT * FROM Adresses WHERE addressId=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<Address>()
		{
			@Override
			public Address extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				 if (rs.next()) {
					 Address address = new Address();
					 address.setAddressId(rs.getString(0));
					 address.setLabelId(rs.getString(1));
					 address.setCountry(rs.getString(2));
					 address.setAddressArgument1(rs.getString(3));
					 address.setAddressArgument2(rs.getString(4));
					 address.setExtraAddressArgument((List<String>)rs.getArray(5));
					
					 return address;
				 }
				return null;
			}	
		}, id);
	}
}
