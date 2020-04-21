package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cchair")
public class Chair {
	@Id
	@Column(name="cno", length=10)
	private int cno;
	@Column(name="ccolor", length=10)
	private String ccolor;
	@Column(name="ctype", length=10)
	private String ctype;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCcolor() {
		return ccolor;
	}
	public void setCcolor(String ccolor) {
		this.ccolor = ccolor;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	

}
