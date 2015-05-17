package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.List;

// need a header table - to store the header of address
// each country will have a table

public class Address extends AddressLabel {
	private String addressId;
	
	public Address(){}
	public Address(String addressId, String labelId, String country, String addressArgument1,
			String addressArgument2, List<String> extraAddressArgument) {
		super(labelId, country, addressArgument1, addressArgument2,
				extraAddressArgument);
		this.addressId = addressId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
}
