package sdp.ratajo.amaderbari.dto.flatpack;

import java.util.Arrays;
import java.util.List;

public class Flat {
	private String flat_id;
	private String addressId;
	private String owner_email;
	private String renter_email;
	private String map_url;
	private List<String> image_ids;
	private String square_foot;
	private double rent;
	private List<String> extraData;
	
	public static final List<String> EXTRA_DATA_HEADER = Arrays.asList("type", "no_of_bed", "no_of_bath", "no_of_balcony", "no_of_dining", "no_of_drawing", "no_of_kitchen");
	
	
	public Flat(){}

	public Flat(String flat_id, String addressId, String owner_email,
			String renter_email, String map_url, List<String> image_ids,
			String square_foot, double rent, List<String> extraData) {
		super();
		this.flat_id = flat_id;
		this.addressId = addressId;
		this.owner_email = owner_email;
		this.renter_email = renter_email;
		this.map_url = map_url;
		this.image_ids = image_ids;
		this.square_foot = square_foot;
		this.rent = rent;
		this.extraData = extraData;
	}


	public String getFlat_id() {
		return flat_id;
	}


	public void setFlat_id(String flat_id) {
		this.flat_id = flat_id;
	}


	public String getAddressId() {
		return addressId;
	}


	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}


	public String getOwner_email() {
		return owner_email;
	}


	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}


	public String getRenter_email() {
		return renter_email;
	}


	public void setRenter_email(String renter_email) {
		this.renter_email = renter_email;
	}


	public String getMap_url() {
		return map_url;
	}


	public void setMap_url(String map_url) {
		this.map_url = map_url;
	}


	public List<String> getImage_ids() {
		return image_ids;
	}


	public void setImage_ids(List<String> image_ids) {
		this.image_ids = image_ids;
	}


	public String getSquare_foot() {
		return square_foot;
	}


	public void setSquare_foot(String square_foot) {
		this.square_foot = square_foot;
	}


	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public List<String> getExtraData() {
		return extraData;
	}


	public void setExtraData(List<String> extraData) {
		this.extraData = extraData;
	}
}
