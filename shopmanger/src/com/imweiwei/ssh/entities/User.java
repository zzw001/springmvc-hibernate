package com.imweiwei.ssh.entities;

public class User {

	private Integer user_id;
	private String user_name;
	private String user_password;
	private String user_phone;
	private String user_email;
	private String user_address;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", user_phone=" + user_phone + ", user_email=" + user_email + ", user_address=" + user_address + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String user_name, String user_password, String user_phone, String user_email, String user_address) {
		super();
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_address = user_address;
	}
	
}
