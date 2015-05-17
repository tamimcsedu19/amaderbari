package sdp.ratajo.amaderbari.dto.flatpack;

public class Image{
	private String imageId;
	private String imageUrl;
	private String imageType;
	
	public Image(){}

	public Image(String imageId, String imageUrl, String imageType) {
		super();
		this.imageId = imageId;
		this.imageUrl = imageUrl;
		this.imageType = imageType;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
}
