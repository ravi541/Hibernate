package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class Car extends Vehicle {
	@Column
private int cno;
	@Column
private String cwheels;
	@Column
private String cname;
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCwheels() {
	return cwheels;
}
public void setCwheels(String cwheels) {
	this.cwheels = cwheels;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}

}
