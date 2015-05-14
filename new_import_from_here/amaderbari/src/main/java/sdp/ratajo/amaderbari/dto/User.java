package sdp.ratajo.amaderbari.dto;

public class User {
	private String national_id;
	private String user_name;
	private String password;
	private String name;
	private String email;
	private String contact_no;
	private String religion;
	private String occupation;
	
	public User(String national_id, String user_name, String password,
			String name, String email, String contact_no, String religion,
			String occupation) {
		super();
		this.national_id = national_id;
		this.user_name = user_name;
		this.password = password;
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
		this.religion = religion;
		this.occupation = occupation;
	}

	public String getNational_id() {
		return national_id;
	}
	public void setNational_id(String national_id) {
		this.national_id = national_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
