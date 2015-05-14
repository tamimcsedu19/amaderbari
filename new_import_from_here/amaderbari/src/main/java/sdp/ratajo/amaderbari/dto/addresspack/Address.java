package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.parser.Entity;

public class Address {
	protected ArrayList<String> addressKey;
	protected ArrayList<String> addressVal;
	protected int currentIndex;
	
	protected String country;
	
	public Address(String country){
		addressKey = new ArrayList<String>();
		addressVal = new ArrayList<String>();
		currentIndex = 0;
		this.country = country;
		addressKey.add("country");
		addressVal.add(country);
	}

	@Override
	public String toString() {
		String retString = "";
		for(int i=0; i<addressKey.size(); i++){
			retString += addressKey.get(i) + " : " + addressVal.get(i) + "\n";
		}
		return retString;
	}
}
