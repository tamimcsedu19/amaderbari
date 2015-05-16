package sdp.ratajo.amaderbari.dto.flatpack;

import sdp.ratajo.amaderbari.dto.addresspack.Address;

public class Flat {
	private String flat_id;
	private String addressId;
	private String type; //eg - duplex, single, family
	private String owner_national_id;
	private String renter_national_id;
	private String map_url;
	private String image_id;
	private String square_foot;
	private int no_of_bed;
	private int no_of_bath;
	private int no_of_balcony;
	private int no_of_dining;
	private int no_of_drawing_room;
	private int no_of_kitchen;
	private double flat_rate;
	
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

	public int getNo_of_bed() {
		return no_of_bed;
	}

	public void setNo_of_bed(int no_of_bed) {
		this.no_of_bed = no_of_bed;
	}

	public int getNo_of_bath() {
		return no_of_bath;
	}

	public void setNo_of_bath(int no_of_bath) {
		this.no_of_bath = no_of_bath;
	}

	public int getNo_of_balcony() {
		return no_of_balcony;
	}

	public void setNo_of_balcony(int no_of_balcony) {
		this.no_of_balcony = no_of_balcony;
	}

	public int getNo_of_dining() {
		return no_of_dining;
	}

	public void setNo_of_dining(int no_of_dining) {
		this.no_of_dining = no_of_dining;
	}

	public int getNo_of_drawing_room() {
		return no_of_drawing_room;
	}

	public void setNo_of_drawing_room(int no_of_drawing_room) {
		this.no_of_drawing_room = no_of_drawing_room;
	}

	public int getNo_of_kitchen() {
		return no_of_kitchen;
	}

	public void setNo_of_kitchen(int no_of_kitchen) {
		this.no_of_kitchen = no_of_kitchen;
	}

	public double getFlat_rate() {
		return flat_rate;
	}

	public void setFlat_rate(double flat_rate) {
		this.flat_rate = flat_rate;
	}
	
	

}
