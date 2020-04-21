package com.ravi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TV {
	@Id
	@Column(name="tno")
	private int tno;
	@Column(name="tsize")
	private String tsize;
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTsize() {
		return tsize;
	}
	public void setTsize(String tsize) {
		this.tsize = tsize;
	}
	

}
