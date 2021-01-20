package org.OurTime.DTO;

public class MemberDTO {
	String name;
	String userName;
	String password;
	String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ "]";
	}

	
	
}
