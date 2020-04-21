package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="things")
public class Things {
	@Id
	@Column(name="tid", length=10)
	private int tid;
	@Column(name="tname" , length=10)
	private String tname;
	@Column(name="tcost", length=10)
	private float tcost;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public float getTcost() {
		return tcost;
	}
	public void setTcost(float tcost) {
		this.tcost = tcost;
	}
	

}
