package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.List;

// need a header table - to store the header of address
// each country will have a table

public class Address extends AddressLabel {
	private Integer addressId;
	
	public Address(){}
	
	public Address(Integer addressId, Integer labelId, String country, String addressArgument1,
			String addressArgument2, String extraAddressArgument) {
		super(labelId, country, addressArgument1, addressArgument2,
				extraAddressArgument);
		this.addressId = addressId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", labelId=" + labelId
				+ ", country=" + country + ", addressArgument1="
				+ addressArgument1 + ", addressArgument2=" + addressArgument2
				+ ", extraAddressArgument=" + extraAddressArgument + "]";
	}
	
	
	
}
