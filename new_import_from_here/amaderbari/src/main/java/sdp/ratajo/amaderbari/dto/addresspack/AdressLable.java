package sdp.ratajo.amaderbari.dto.addresspack;

import java.util.ArrayList;
import java.util.List;

public class AdressLable {
	protected String labelId;
	protected String country;
	protected String addressArgument1;
	protected String addressArgument2;
	protected List<String> extraAddressArgument;
	
	public AdressLable(){}
	
	public AdressLable(String labelId, String country, String addressArgument1,
			String addressArgument2, List<String> extraAddressArgument) {
		super();
		this.labelId = labelId;
		this.country = country;
		this.addressArgument1 = addressArgument1;
		this.addressArgument2 = addressArgument2;
		this.extraAddressArgument = extraAddressArgument;
	}

	public String getLabelId() {
		return labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
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
	public List<String> getExtraAddressArgument() {
		return extraAddressArgument;
	}
	public void setExtraAddressArgument(List<String> extraAddressArgument) {
		this.extraAddressArgument = extraAddressArgument;
	}
}
