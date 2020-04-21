package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="School")
public class School {
	@Id
	@Column(name="sid" , length=10)
	private int sid;
	@Column(name="sname", length=30)
	private String sname;
	@Column(name="saddr" , length=20)
	private String saddr;
	@Column(name="spin" , length=10)
	private String spin;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public String getSpin() {
		return spin;
	}
	public void setSpin(String spin) {
		this.spin = spin;
	}
	

}
