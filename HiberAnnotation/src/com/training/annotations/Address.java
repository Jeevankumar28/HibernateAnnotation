package com.training.annotations;
import javax.annotation.*;
import javax.persistence.*;

@Entity
@Table(name="AddressAnnot1")
public class Address {
	@Id
	@Column(name="Addressid")
	private int addressid;
	@Column(name="City")
	private String city;
	@Column(name="HouseNo")
	private int houseno;
	
	@OneToOne (mappedBy="addobj")
	private Employee eobj;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public Employee getEobj() {
		return eobj;
	}
	public void setEobj(Employee eobj) {
		this.eobj = eobj;
	}
	
	

}
