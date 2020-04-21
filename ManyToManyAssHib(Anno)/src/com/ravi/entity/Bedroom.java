package com.ravi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="bedroom")
public class Bedroom {
	@Id
	@Column(name="bid")
	private int bid;
	@Column(name="bname")
	private String bname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bedroom_things" , joinColumns = {@JoinColumn(name="bid")} , inverseJoinColumns = {@JoinColumn(name="tid")})
	private Set<Things> things;

	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Set<Things> getThings() {
		return things;
	}
	public void setThings(Set<Things> things) {
		this.things = things;
	}

}
