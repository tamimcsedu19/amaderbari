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
	
	private long flatId;
	private long addressId;
	private long extraFlatDataId;
	private long imageId;
	
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
	
	public Flat(){}

	public Flat(long flatId, long addressId, long extraFlatDataId, long imageId,
			String ownerEmail, String renterEmail, String mapUrl,
			String squareFoot, double rent) {
		super();
		this.flatId = flatId;
		this.addressId = addressId;
		this.extraFlatDataId = extraFlatDataId;
		this.imageId = imageId;
		this.ownerEmail = ownerEmail;
		this.renterEmail = renterEmail;
		this.mapUrl = mapUrl;
		this.squareFoot = squareFoot;
		this.rent = rent;
	}

	public long getFlatId() {
		return flatId;
	}


	public void setFlatId(long flatId) {
		this.flatId = flatId;
	}


	public long getAddressId() {
		return addressId;
	}


	public void setAddressId(long addressId) {
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


	public long getExtraFlatDataId() {
		return extraFlatDataId;
	}


	public void setExtraFlatDataId(long extraFlatDataId) {
		this.extraFlatDataId = extraFlatDataId;
	}


	public long getImageId() {
		return imageId;
	}


	public void setImageId(long imageId) {
		this.imageId = imageId;
	}


	@Override
	public String toString() {
		return "Flat [flatId=" + flatId + ", addressId=" + addressId
				+ ", ownerEmail=" + ownerEmail + ", renterEmail=" + renterEmail
				+ ", mapUrl=" + mapUrl + ", squareFoot=" + squareFoot
				+ ", rent=" + rent + ", extraFlatDataId=" + extraFlatDataId
				+ ", imageId=" + imageId + "]";
	}
}
