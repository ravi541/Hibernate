package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="porttv")
@PrimaryKeyJoinColumn(name="tno")
public class PortTv extends TV {
	@Column(name="tname")
	private String tname;
	@Column(name="tcolor")
	private String tcolor;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTcolor() {
		return tcolor;
	}
	public void setTcolor(String tcolor) {
		this.tcolor = tcolor;
	}
	

}
