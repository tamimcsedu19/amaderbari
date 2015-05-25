package sdp.ratajo.amaderbari.dao;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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
		String sql = "UPDATE Flats SET flatId=?, addressId=?, extraFlatDataId=?, imageId=?, ownerEmail=?, renterEmail=?,"
				+ "mapUrl=?, squareFoot=?, rent=?)";
		
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
					 flat.setFlatId(rs.getLong(0));
					 flat.setAddressId(rs.getLong(1));
					 flat.setExtraFlatDataId(rs.getLong(2));
					 flat.setImageId(rs.getLong(3));
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
}
