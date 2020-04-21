package com.ravi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rroom")
public class Room {
	@Id
	@Column(name="rno", length=10)
private int rno;
	@Column(name="rsize", length=10)
private String rsize;
	@OneToOne(cascade =CascadeType.ALL )
private Chair chair;
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getRsize() {
	return rsize;
}
public void setRsize(String rsize) {
	this.rsize = rsize;
}
public Chair getChair() {
	return chair;
}
public void setChair(Chair chair) {
	this.chair = chair;
}


}
