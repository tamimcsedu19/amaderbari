package sdp.ratajo.amaderbari.dto.addresspack;

public class BangladeshAddress extends Address {
		
	protected String division;
	protected String city;
	public BangladeshAddress() {}
	public BangladeshAddress(String country, String division, String city) {
		super(country);
		this.division = division;
		this.city = city;
		addressVals.add(division);
		addressVals.add(city);
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	
}
