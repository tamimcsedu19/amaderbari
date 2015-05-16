package sdp.ratajo.amaderbari.dto.flatpack;

public class Flat {
	private String flat_id;
	private String addressId;
	private String type; //eg - duplex, single, family
	private String owner_national_id;
	private String renter_national_id;
	private String map_url;
	private String image_id;
	private String square_foot;
	private double rent;
	private String extraData;
	
	public static final String[] EXTRA_DATA_HEADER = {"no_of_bed", "no_of_bath", "no_of_balcony", "no_of_dining", "no_of_drawing", "no_of_kitchen"};
	
	
	public Flat(){}


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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getOwner_national_id() {
		return owner_national_id;
	}


	public void setOwner_national_id(String owner_national_id) {
		this.owner_national_id = owner_national_id;
	}


	public String getRenter_national_id() {
		return renter_national_id;
	}


	public void setRenter_national_id(String renter_national_id) {
		this.renter_national_id = renter_national_id;
	}


	public String getMap_url() {
		return map_url;
	}


	public void setMap_url(String map_url) {
		this.map_url = map_url;
	}


	public String getImage_id() {
		return image_id;
	}


	public void setImage_id(String image_id) {
		this.image_id = image_id;
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


	public String[] getExtraDatas() {
		String[] datas = extraData.split(" ");
		return datas;
	}

	public String getExtraData(){
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	
}
