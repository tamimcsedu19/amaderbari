package sdp.ratajo.amaderbari.userpack.dto;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class UserForm {
	@NotNull
	@Size(min=2, max=30)
	String first_name;
	
	@NotNull
	@Size(min=2,max=30)
	String last_name;
	
	 @NotNull 
	 @Email
	 private String email;
	 @NotNull
	 @Size(min=6,max=30,message="Password must be between 6 to 30 characters")
	 private String password; 
	 
	 @NotNull(message="passwords do not match")
	 private String password_confirmation;
	 public String getPassword() {
		return password;
	}

	private void check_password()
	{
		if(this.password == null || this.password_confirmation == null)
	        return;
		else if(!this.password.equals(password_confirmation))
	        this.password_confirmation = null;
		return;
	}
	public String getPassword_confirmation() {
		return password_confirmation;
	}

	public void setPassword_confirmation(String password_confirmation) {
		
		this.password_confirmation = password_confirmation;
		check_password();
	}

	public void setPassword(String password) {
		this.password = password;
		check_password();
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
	

}
