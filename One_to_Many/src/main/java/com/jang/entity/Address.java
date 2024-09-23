package com.jang.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long addId;
	private String city;
	private String addressType;
	
	//==============================use for bi ONE TO ONE
	
	//@OneToOne(mappedBy = "address") // address by take from Employee
	//private Employee emp;
	
	
	
	
	
	
	
	
	
	
	
	public Long getAddId() {
		return addId;
	}
	public void setAddId(Long addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public Address(Long addId, String city, String addressType) {
		super();
		this.addId = addId;
		this.city = city;
		this.addressType = addressType;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", addressType=" + addressType + "]";
	}
	
	
	
	
	
}
