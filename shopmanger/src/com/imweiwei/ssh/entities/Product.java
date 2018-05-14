package com.imweiwei.ssh.entities;

public class Product {

	private Integer pro_id;
	private String pro_name;
	private String pro_brand;
	private String pro_factory;
	private String pro_dealer;
	private String pro_date;
	private String pro_type;
	private Double pro_price;
	public Integer getPro_id() {
		return pro_id;
	}
	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_brand() {
		return pro_brand;
	}
	public void setPro_brand(String pro_brand) {
		this.pro_brand = pro_brand;
	}
	public String getPro_factory() {
		return pro_factory;
	}
	public void setPro_factory(String pro_factory) {
		this.pro_factory = pro_factory;
	}
	
	public String getPro_dealer() {
		return pro_dealer;
	}
	public void setPro_dealer(String pro_dealer) {
		this.pro_dealer = pro_dealer;
	}
	public String getPro_date() {
		return pro_date;
	}
	public void setPro_date(String pro_date) {
		this.pro_date = pro_date;
	}
	public String getPro_type() {
		return pro_type;
	}
	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}
	public Double getPro_price() {
		return pro_price;
	}
	public void setPro_price(Double pro_price) {
		this.pro_price = pro_price;
	}
	
	
	@Override
	public String toString() {
		return "Product [pro_name=" + pro_name + ", pro_brand=" + pro_brand + ", pro_factory=" + pro_factory
				+ ", pro_dealer=" + pro_dealer + ", pro_date=" + pro_date + ", pro_type=" + pro_type + ", pro_price="
				+ pro_price + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pro_name, String pro_brand, String pro_factory, String pro_dealer, String pro_date,
			String pro_type, Double pro_price) {
		super();
		this.pro_name = pro_name;
		this.pro_brand = pro_brand;
		this.pro_factory = pro_factory;
		this.pro_dealer = pro_dealer;
		this.pro_date = pro_date;
		this.pro_type = pro_type;
		this.pro_price = pro_price;
	}
	
	
	
}
