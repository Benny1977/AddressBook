package com.pa.address;
import java.io.Serializable;
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3693793364037594087L;
	private int id;
	private String address;
	private String street;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}

