package com.imweiwei.ssh.entities;

import java.util.HashSet;
import java.util.Set;

public class Shop {
	
	private Integer shop_id;
	private String shop_name;
	private String shop_password;
	private String shop_address;
	private Set<Product> item=new HashSet<>();
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	
	public String getShop_password() {
		return shop_password;
	}
	public void setShop_password(String shop_password) {
		this.shop_password = shop_password;
	}
	public String getShop_address() {
		return shop_address;
	}
	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}
	
	public Set<Product> getItem() {
		return item;
	}
	public void setItem(Set<Product> item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Shop [shop_id=" + shop_id + ", shop_name=" + shop_name + ", shop_password=" + shop_password
				+ ", shop_address=" + shop_address + "]";
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(String shop_name, String shop_password, String shop_address) {
		super();
		this.shop_name = shop_name;
		this.shop_password = shop_password;
		this.shop_address = shop_address;
	}
	
	

}
