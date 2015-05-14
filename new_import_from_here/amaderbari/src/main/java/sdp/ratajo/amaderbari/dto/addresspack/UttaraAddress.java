package sdp.ratajo.amaderbari.dto.addresspack;

import sdp.ratajo.amaderbari.HomeController;

public class UttaraAddress extends BangladeshAddress {

	protected String sector;
	protected String road_no;
	protected Apartment apartment;
	
	public UttaraAddress(String country, String division, String district,
			String thana_upazilla, String area, String sector, String road_no,
			Apartment apartment) {
		super(country, division, district, thana_upazilla, area);
		this.sector = sector;
		this.road_no = road_no;
		this.apartment = apartment;
		
		addressKey.add("sector");
		addressVal.add(sector);
		
		addressKey.add("road_no");
		addressVal.add(road_no);
		
		addressKey.add("apartment");
		addressVal.add(apartment.toString());
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getRoad_no() {
		return road_no;
	}

	public void setRoad_no(String road_no) {
		this.road_no = road_no;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
}
