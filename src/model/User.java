package model;

public class User {
	 private String id;
     private String password;
     private String name;
     private String sex;
     private String email;
     private String telephone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", sex=" + sex + ", email=" + email
				+ ", telephone=" + telephone + "]";
	}
	public User(String id, String password, String name, String sex, String email, String telephone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.telephone = telephone;
	}
	
	
} 
