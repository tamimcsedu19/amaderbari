package sdp.ratajo.amaderbari.dto.flatpack;

public class Image{
	private String image_id;
	private String image_url;
	private String image_type;
	
	public Image(){}
	
	public Image(String image_id, String image_url, String image_type) {
		super();
		this.image_id = image_id;
		this.image_url = image_url;
		this.image_type = image_type;
	}


	public String getImage_id() {
		return image_id;
	}


	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}


	public String getImage_url() {
		return image_url;
	}


	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}


	public String getImage_type() {
		return image_type;
	}


	public void setImage_type(String image_type) {
		this.image_type = image_type;
	}


	@Override
	public String toString() {
		return "Image [image_id=" + image_id + ", image_url=" + image_url
				+ ", image_type=" + image_type + "]";
	}
	
	
	
	
}
