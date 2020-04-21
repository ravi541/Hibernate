package com.ravi.entity;

import java.util.Set;

public class Bedroom {
	private int bid;
	private String bname;
	private Set<Things> things;
	private Things thing;
	public Things getThing() {
		return thing;
	}
	public void setThing(Things thing) {
		this.thing = thing;
	}
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
