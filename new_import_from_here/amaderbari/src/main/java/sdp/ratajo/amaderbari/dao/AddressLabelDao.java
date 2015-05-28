package sdp.ratajo.amaderbari.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.dto.addresspack.AddressLabel;

public class AddressLabelDao extends CommonDao {

	@Override
	public boolean save(Object obj) {
		AddressLabel addressLabel = (AddressLabel) obj;
		String sql = "INSERT INTO AdressesLabels (labelId, country, addressArgument1,"
				+ " addressArgument2, extraAddressArgument)"
            	+ " VALUES (?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, addressLabel.getLabelId(), addressLabel.getCountry(),
					addressLabel.getAddressArgument1(), addressLabel.getAddressArgument2(),
					addressLabel.getExtraAddressArgument());
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Object obj) {
		AddressLabel addressLabel = (AddressLabel) obj;
		String sql = "UPDATE AdressesLabels SET labelId=?, country=?, addressArgument1=?,"
				+ "addressArgument2=?, extraAddressArgument=?)";
		try{
			jdbcTemplate.update(sql, addressLabel.getLabelId(), addressLabel.getCountry(),
					addressLabel.getAddressArgument1(), addressLabel.getAddressArgument2(),
					addressLabel.getExtraAddressArgument());
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	boolean delete(String id) {
		String sql = "DELETE FROM AdressesLabels WHERE labelId=?";
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
		String sql = "SELECT * FROM AdressesLabels WHERE labelId=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<AddressLabel>()
		{
			@Override
			public AddressLabel extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				 if (rs.next()) {
					 AddressLabel addressLabel = new AddressLabel();
					 
					 addressLabel.setLabelId(rs.getLong(0));
					 addressLabel.setCountry(rs.getString(1));
					 addressLabel.setAddressArgument1(rs.getString(2));
					 addressLabel.setAddressArgument2(rs.getString(3));
					 addressLabel.setExtraAddressArgument(rs.getString(4));
					
					 return addressLabel;
				 }
				return null;
			}	
		}, id);
	}


	public List<Object> search(String sql) {
		List<Object> objects = new ArrayList<Object>();
		System.out.println("OKkkkkkkkkkkkkkkkkkkkkk");
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			AddressLabel object = new AddressLabel();
			
			object.setLabelId((Long)row.get(0));
			object.setCountry((String)row.get(1));
			object.setAddressArgument1((String)row.get(2));
			object.setAddressArgument2((String)row.get(3));
			object.setExtraAddressArgument((String)row.get(4));
			 
			objects.add(object);
		}
		System.out.println("list size -> " + objects.size());
		return  objects;
	}
}
