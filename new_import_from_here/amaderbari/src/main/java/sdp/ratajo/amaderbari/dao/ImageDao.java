package sdp.ratajo.amaderbari.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.dto.flatpack.Image;

public class ImageDao extends CommonDao {

	@Override
	public boolean save(Object obj) {
		Image image = (Image) obj;
		String sql = "INSERT INTO Images (imageId, imageUrl1, imageUrl2, imageUrl3, imageUrl4, imageUrl5)"
            	+ " VALUES (?, ?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, image.getImageId(), image.getImageUrl1(), image.getImageUrl2(),
					image.getImageUrl3(), image.getImageUrl4(), image.getImageUrl5());
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Object obj) {
		Image image = (Image) obj;
		String sql = "UPDATE Images SET imageId=?, imageUrl1=?, imageUrl2=?, imageUrl3=?, imageUrl4=?"
				+ ", imageUrl5=?";
		try{
			jdbcTemplate.update(sql, image.getImageId(), image.getImageUrl1(), image.getImageUrl2(),
					image.getImageUrl3(), image.getImageUrl4(), image.getImageUrl5());
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	boolean delete(String id) {
		String sql = "DELETE FROM Images WHERE imageId=?";
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
		String sql = "SELECT * FROM Images WHERE imageId=?";
		return jdbcTemplate.query(sql,new ResultSetExtractor<Image>()
		{
			@Override
			public Image extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				 if (rs.next()) {
					 Image image = new Image();
					 
					 image.setImageId(rs.getLong(0));
					 image.setImageUrl1(rs.getString(1));
					 image.setImageUrl2(rs.getString(2));
					 image.setImageUrl3(rs.getString(3));
					 image.setImageUrl4(rs.getString(4));
					 image.setImageUrl5(rs.getString(5));
					 return image;
				 }
				return null;
			}	
		}, id);
	}
}
