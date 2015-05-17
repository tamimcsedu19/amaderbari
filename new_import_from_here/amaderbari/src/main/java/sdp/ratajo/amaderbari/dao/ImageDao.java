package sdp.ratajo.amaderbari.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import sdp.ratajo.amaderbari.dto.flatpack.Image;

public class ImageDao extends CommonDao {

	public ImageDao(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public boolean save(Object obj) {
		Image image = (Image) obj;
		String sql = "INSERT INTO Images (imageId, imageUrl, imageType)"
            	+ " VALUES (?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, image.getImageId(), image.getImageUrl(), image.getImageType());
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Object obj) {
		Image image = (Image) obj;
		String sql = "UPDATE Images SET imageId=?, imageUrl=?, imageType=?";
		try{
			jdbcTemplate.update(sql, image.getImageId(), image.getImageUrl(), image.getImageType());
			
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
					 
					 image.setImageId(rs.getString(1));
					 image.setImageUrl(rs.getString(2));
					 image.setImageType(rs.getString(3));
					
					 return image;
				 }
				return null;
			}	
		}, id);
	}
}
