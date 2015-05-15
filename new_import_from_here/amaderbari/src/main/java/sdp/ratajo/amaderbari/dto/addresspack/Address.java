package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

// need a header table - to store the header of address
// each country will have a table

public class Address {
	private String country;
	private String addressArgument1;
	private String addressArgument2;
	private String addressArgument3;
	private String addressArgument4;
	private ArrayList<String> extraAddressArgument;
	private String addressId;
	
	public Address(){}

	public Address(String country, String addressArgument1,
			String addressArgument2, String addressArgument3,
			String addressArgument4, ArrayList<String> extraAddressArgument,
			String addressId) {
		super();
		this.country = country;
		this.addressArgument1 = addressArgument1;
		this.addressArgument2 = addressArgument2;
		this.addressArgument3 = addressArgument3;
		this.addressArgument4 = addressArgument4;
		this.extraAddressArgument = extraAddressArgument;
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddressArgument1() {
		return addressArgument1;
	}

	public void setAddressArgument1(String addressArgument1) {
		this.addressArgument1 = addressArgument1;
	}

	public String getAddressArgument2() {
		return addressArgument2;
	}

	public void setAddressArgument2(String addressArgument2) {
		this.addressArgument2 = addressArgument2;
	}

	public String getAddressArgument3() {
		return addressArgument3;
	}

	public void setAddressArgument3(String addressArgument3) {
		this.addressArgument3 = addressArgument3;
	}

	public String getAddressArgument4() {
		return addressArgument4;
	}

	public void setAddressArgument4(String addressArgument4) {
		this.addressArgument4 = addressArgument4;
	}

	public ArrayList<String> getExtraAddressArgument() {
		return extraAddressArgument;
	}

	public void setExtraAddressArgument(ArrayList<String> extraAddressArgument) {
		this.extraAddressArgument = extraAddressArgument;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
