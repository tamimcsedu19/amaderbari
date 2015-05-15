package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public abstract class Address {
	public ArrayList<String> addressVals;
	protected String country;
	public Address()
	{}
	public Address(String country){
		addressVals = new ArrayList<String>();
		this.country = country;
		addressVals.add(country);
	}

	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
	
}
