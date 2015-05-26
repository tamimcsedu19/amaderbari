package sdp.ratajo.amaderbari.dto.flatpack;

import org.hibernate.validator.constraints.URL;

public class Image{
	private long imageId;
	@URL
	private String imageUrl1;
	@URL
	private String imageUrl2;
	@URL
	private String imageUrl3;
	@URL
	private String imageUrl4;
	@URL
	private String imageUrl5;
	
	public Image(){}

	public Image(long imageId, String imageUrl1, String imageUrl2,
			String imageUrl3, String imageUrl4, String imageUrl5) {
		super();
		this.imageId = imageId;
		this.imageUrl1 = imageUrl1;
		this.imageUrl2 = imageUrl2;
		this.imageUrl3 = imageUrl3;
		this.imageUrl4 = imageUrl4;
		this.imageUrl5 = imageUrl5;
	}

	public long getImageId() {
		return imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl1() {
		return imageUrl1;
	}

	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}

	public String getImageUrl2() {
		return imageUrl2;
	}

	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}

	public String getImageUrl3() {
		return imageUrl3;
	}

	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}

	public String getImageUrl4() {
		return imageUrl4;
	}

	public void setImageUrl4(String imageUrl4) {
		this.imageUrl4 = imageUrl4;
	}

	public String getImageUrl5() {
		return imageUrl5;
	}

	public void setImageUrl5(String imageUrl5) {
		this.imageUrl5 = imageUrl5;
	}

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl1=" + imageUrl1
				+ ", imageUrl2=" + imageUrl2 + ", imageUrl3=" + imageUrl3
				+ ", imageUrl4=" + imageUrl4 + ", imageUrl5=" + imageUrl5 + "]";
	}
	
}
