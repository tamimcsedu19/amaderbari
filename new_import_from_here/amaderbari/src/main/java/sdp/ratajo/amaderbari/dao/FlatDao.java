package sdp.ratajo.amaderbari.dao;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import javax.validation.constraints.Pattern.Flag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.dto.addresspack.Address;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;

public class FlatDao extends CommonDao {	
	
	@Override
	public boolean save(Object obj) {
		Flat flat = (Flat) obj;
		String sql = "INSERT INTO Flats (flatId, addressId, extraFlatDataId, imageId, ownerEmail, renterEmail,"
				+ " mapUrl, squareFoot, rent)"
            	+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, flat.getFlatId(), flat.getAddressId(), flat.getExtraFlatDataId(), flat.getImageId(), flat.getOwnerEmail(),
					flat.getRenterEmail(), flat.getMapUrl(), flat.getSquareFoot(),
					flat.getRent());
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Object obj) {
		Flat flat = (Flat) obj;
		String sql = "UPDATE Flats SET flatId=" + flat.getFlatId();
		
		if(flat.getAddressId() != 0) sql += ", addressId=" + flat.getAddressId();
		if(flat.getExtraFlatDataId() != 0) sql += ", extraFlatDataId=" + flat.getExtraFlatDataId();
		if(flat.getImageId() != 0) sql += ", imageId=" + flat.getImageId();
		if(flat.getOwnerEmail() != null) sql += ", ownerEmail=" + flat.getOwnerEmail();
		if(flat.getRenterEmail() != null) sql += ", renterEmail=" + flat.getRenterEmail();
		if(flat.getMapUrl() != null) sql += ", mapUrl=" + flat.getMapUrl();
		if(flat.getSquareFoot() != null) sql += ", squareFoot=" + flat.getSquareFoot();
		if(flat.getRent() > 0.0) sql += ", rent=" + flat.getRent();
		
		sql += " where flatId=" + flat.getFlatId();
		
		try{
			jdbcTemplate.update(sql);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(String id) {
		String sql = "DELETE FROM Flats WHERE flatId=?";
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
		String sql = "SELECT * FROM Flats WHERE flatId=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<Flat>()
		{
			@Override
			public Flat extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				 if (rs.next()) {
					 Flat flat = new Flat();
					 flat.setFlatId(rs.getInt(0));
					 flat.setAddressId(rs.getInt(1));
					 flat.setExtraFlatDataId(rs.getInt(2));
					 flat.setImageId(rs.getInt(3));
					 
					 flat.setOwnerEmail(rs.getString(4));
					 flat.setRenterEmail(rs.getString(5));
					 flat.setMapUrl(rs.getString(6));
					 flat.setSquareFoot(rs.getString(7));
					 flat.setRent(rs.getDouble(rs.getString(8)));
					 
					 return flat;
				 }
				return null;
			}	
		}, id);
	}


	public List<Object> search(String sql) {
		List<Object> objects = new ArrayList<Object>();
		 
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			Flat object = new Flat();
			
			object.setFlatId((Integer)row.get(0));
			object.setAddressId((Integer)row.get(1));
			object.setExtraFlatDataId((Integer)row.get(2));
			object.setImageId((Integer)row.get(3));
			object.setOwnerEmail((String)row.get(4));
			object.setRenterEmail((String)row.get(5));
			object.setMapUrl((String)row.get(6));
			object.setSquareFoot((String)row.get(7));
			object.setRent((Double)row.get(8));
			 
			objects.add(object);
		}
		return  objects;
	}
}
