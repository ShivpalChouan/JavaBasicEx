package com.core.java8.lang.stream;

public class User {

	private String name;
	private String dept;
	private boolean admin;

	public User(String name, String dept, boolean admin) {
		super();
		this.name = name;
		this.dept = dept;
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", dept=" + dept + ", admin=" + admin
				+ "]";
	}

}
