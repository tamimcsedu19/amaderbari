package sdp.ratajo.amaderbari.dto.addresspack;

/*
 * search algo - 
 * 1. find list<address id> from given country, field1, field2, ...
 * 2. find apartment using these address id
 * 
 */

public class Apartment {
	private String addressId;
	private String house_no;
	private int floor;
	private String apartment_no;
	
	public Apartment(){}
	
	public Apartment(String addressId, String house_no, int floor,
			String apartment_no) {
		super();
		this.addressId = addressId;
		this.house_no = house_no;
		this.floor = floor;
		this.apartment_no = apartment_no;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getApartment_no() {
		return apartment_no;
	}

	public void setApartment_no(String apartment_no) {
		this.apartment_no = apartment_no;
	}
	
}
