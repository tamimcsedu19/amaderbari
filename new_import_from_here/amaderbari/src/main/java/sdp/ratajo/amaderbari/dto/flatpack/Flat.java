package sdp.ratajo.amaderbari.dto.flatpack;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

public class Flat {
	@Singleton
	public static volatile long id;
	
	private String flatId;
	private String addressId;
	
	@Min(value=1, message="Can't be empty")
	@Email(message="not valid email")
	private String ownerEmail;
	
	@Email(message="not valid email")
	private String renterEmail;
	
	@URL(message="not valid URL")
	private String mapUrl;
	
	@Size(min=3, max=10, message="The length of data must be between 3 and 10")
	private String squareFoot;
	
	@Min(value=0, message="Can't be less than 0.0")
	private double rent;
	
	private List<String> extraData;
	private List<String> imageIds;
	
	public static final List<String> EXTRA_DATA_HEADER = Arrays.asList("type", "no_of_bed", "no_of_bath", "no_of_balcony", "no_of_dining", "no_of_drawing", "no_of_kitchen");
	
	
	public Flat(){}

	public Flat(String flatId, String addressId, String ownerEmail,
			String renterEmail, String mapUrl, String squareFoot, double rent,
			List<String> extraData, List<String> imageIds) {
		super();
		this.flatId = flatId;
		this.addressId = addressId;
		this.ownerEmail = ownerEmail;
		this.renterEmail = renterEmail;
		this.mapUrl = mapUrl;
		this.squareFoot = squareFoot;
		this.rent = rent;
		this.extraData = extraData;
		this.imageIds = imageIds;
	}



	public String getFlatId() {
		return flatId;
	}

	public void setFlatId(String flatId) {
		this.flatId = flatId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getRenterEmail() {
		return renterEmail;
	}

	public void setRenterEmail(String renterEmail) {
		this.renterEmail = renterEmail;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public List<String> getImageIds() {
		return imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;
	}

	public String getSquareFoot() {
		return squareFoot;
	}

	public void setSquareFoot(String squareFoot) {
		this.squareFoot = squareFoot;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public List<String> getExtraData() {
		return extraData;
	}

	public void setExtraData(List<String> extraData) {
		this.extraData = extraData;
	}

	@Override
	public String toString() {
		return "Flat [flatId=" + flatId + ", addressId=" + addressId
				+ ", ownerEmail=" + ownerEmail + ", renterEmail=" + renterEmail
				+ ", mapUrl=" + mapUrl + ", squareFoot=" + squareFoot
				+ ", rent=" + rent + ", extraData=" + extraData + ", imageIds="
				+ imageIds + "]";
	}
	
	
	
}
