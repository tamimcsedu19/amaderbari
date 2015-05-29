package sdp.ratajo.amaderbari.dao;

import java.util.List;

import sdp.ratajo.amaderbari.dto.flatpack.ExtraFlatData;
import sdp.ratajo.amaderbari.dto.flatpack.Image;

public class ExtraDataDao extends CommonDao {

	@Override
	boolean save(Object obj) {
		ExtraFlatData extraData = (ExtraFlatData) obj;
		String sql = "INSERT INTO ExtraFlatData (extraFlatDataId, flatNum, type, numOfBed, numOfBath, numOfBalcony,"
				+ " numOfDining, numOfDrawing, numOfKitchen)"
            	+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, extraData.getExtraFlatDataId(), extraData.getFlatNum(), extraData.getType(), extraData.getNumOfBed(),
					extraData.getNumOfBath(), extraData.getNumOfBalcony(), extraData.getNumOfDining(), 
					extraData.getNumOfDrawing(), extraData.getNumOfKitchen());
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	boolean update(Object obj) {
		ExtraFlatData extraData = (ExtraFlatData) obj;
		String sql = "INSERT INTO ExtraFlatData (extraFlatDataId, flatNum, type, numOfBed, numOfBath, numOfBalcony,"
				+ " numOfDining, numOfDrawing, numOfKitchen)"
            	+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try{
			jdbcTemplate.update(sql, extraData.getExtraFlatDataId(), extraData.getFlatNum(), extraData.getType(), extraData.getNumOfBed(),
					extraData.getNumOfBath(), extraData.getNumOfBalcony(), extraData.getNumOfDining(), 
					extraData.getNumOfDrawing(), extraData.getNumOfKitchen());
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	Object get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
