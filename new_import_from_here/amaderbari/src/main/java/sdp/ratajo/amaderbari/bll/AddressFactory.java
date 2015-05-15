package sdp.ratajo.amaderbari.bll;

import sdp.ratajo.amaderbari.dto.addresspack.*;

//check if the address is present in database

public class AddressFactory {

	public Address make(String country, String col1val, String col2val)
	{
		Address address = new Address();
		address.setCountry(country);
		address.setAddressArgument1(col1val);
		address.setAddressArgument2(col2val);
		return address;
	}
	
}
