package com.ravi.entity;

import java.util.Collection;

public class Department {
	private int did;
	private String dname;
	private Collection<Employee> emps;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Collection<Employee> getEmps() {
		return emps;
	}
	public void setEmps(Collection<Employee> emps) {
		this.emps = emps;
	}

}
