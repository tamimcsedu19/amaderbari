package sdp.ratajo.amaderbari.dto.addresspack;

public class Apartment {
	private String house_no;
	private int floor;
	private String apartment_no;
	public Apartment(String house_no, int floor, String apartment_no) {
		super();
		this.house_no = house_no;
		this.floor = floor;
		this.apartment_no = apartment_no;
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
	@Override
	public String toString() {
		return "Apartment [house_no=" + house_no + ", floor=" + floor
				+ ", apartment_no=" + apartment_no + "]";
	}
	
}
