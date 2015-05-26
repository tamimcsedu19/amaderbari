package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.List;

// need a header table - to store the header of address
// each country will have a table

public class Address extends AddressLabel {
	private long addressId;
	
	public Address(){}
	
	public Address(long addressId, long labelId, String country, String addressArgument1,
			String addressArgument2, String extraAddressArgument) {
		super(labelId, country, addressArgument1, addressArgument2,
				extraAddressArgument);
		this.addressId = addressId;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	
}
