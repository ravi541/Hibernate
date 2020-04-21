package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bike")
public class Bike extends Vehicle {
	@Column(name="bno")
	private int bno;
	@Column(name="bwheels")
	private String bwheels;
	@Column(name="bname")
	private String bname;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBwheels() {
		return bwheels;
	}
	public void setBwheels(String bwheels) {
		this.bwheels = bwheels;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	

}
