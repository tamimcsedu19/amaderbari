package sdp.ratajo.amaderbari.bll;

import sdp.ratajo.amaderbari.dto.addresspack.*;

public class AddressFactory {

	public Address make(String country,String col1val,String col2val)
	{
		
		if(country == "Bangladesh")
			return new BangladeshAddress(country,col1val,col2val);
		return null;
		
	}
	
}
