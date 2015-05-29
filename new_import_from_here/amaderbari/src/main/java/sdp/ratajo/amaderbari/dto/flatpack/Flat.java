package sdp.ratajo.amaderbari.dto.flatpack;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

public class Flat {
	
	private Integer flatId;
	private Integer addressId;
	private Integer extraFlatDataId;
	private Integer imageId;
	
	@Size(min=3, max=50, message="The length of data must be between 3 and 50")
	@Email(message="not valid email")
	private String ownerEmail;
	
	@Size(min=0, max=50, message="The length of data must be between 50 char")
	@Email(message="not valid email")
	private String renterEmail;
	
	@Size(min=0, max=50, message="The length of data must be 50")
	@URL(message="not valid URL")
	private String mapUrl;
	
	@Size(min=3, max=10, message="The length of data must be between 3 and 10")
	private String squareFoot;
	
	@Min(value=0, message="Can't be less than 0.0")
	private double rent;
	
	public Flat(){}

	public Flat(Integer flatId, Integer addressId, Integer extraFlatDataId, Integer imageId,
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

	public Integer getFlatId() {
		return flatId;
	}


	public void setFlatId(Integer flatId) {
		this.flatId = flatId;
	}


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
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


	public Integer getExtraFlatDataId() {
		return extraFlatDataId;
	}


	public void setExtraFlatDataId(Integer extraFlatDataId) {
		this.extraFlatDataId = extraFlatDataId;
	}


	public Integer getImageId() {
		return imageId;
	}


	public void setImageId(Integer imageId) {
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
