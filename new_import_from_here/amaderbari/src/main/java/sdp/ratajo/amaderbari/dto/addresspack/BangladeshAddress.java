package sdp.ratajo.amaderbari.dto.addresspack;

public class BangladeshAddress extends Address {
	protected String division;
	protected String district;
	protected String thana_upazilla;
	protected String area;
	
	public BangladeshAddress(String country, String division, String district,
			String thana_upazilla, String area) {
		super(country);
		this.division = division;
		this.district = district;
		this.thana_upazilla = thana_upazilla;
		this.area = area;
		
		addressKey.add("division");
		addressVal.add(division);
		
		addressKey.add("district");
		addressVal.add(district);
		
		addressKey.add("thana_upazilla");
		addressVal.add(thana_upazilla);
		
		addressKey.add("area");
		addressVal.add(area);
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getThana_upazilla() {
		return thana_upazilla;
	}
	public void setThana_upazilla(String thana_upazilla) {
		this.thana_upazilla = thana_upazilla;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
