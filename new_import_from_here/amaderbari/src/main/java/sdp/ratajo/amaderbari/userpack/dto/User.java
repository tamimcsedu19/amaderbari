package sdp.ratajo.amaderbari.userpack.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	private String first_name;
	private String last_name;
	private String email;
	private String password; 
	private String national_id;
	private String contact_no;
	private String religion;
	private String occupation;
	public User() {}
	public User(UserForm userForm)
	{
		this.first_name = userForm.getFirst_name();
		this.last_name = userForm.getLast_name();
		this.email = userForm.getEmail();
		this.password = userForm.getPassword();
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNational_id() {
		return national_id;
	}
	public void setNational_id(String national_id) {
		this.national_id = national_id;
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
