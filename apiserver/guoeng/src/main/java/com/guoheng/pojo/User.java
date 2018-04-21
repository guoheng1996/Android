package com.guoheng.pojo;

public class User {
	
	public String name;
	private int id;
	public String openID;
	
	public User(String name, int id, String openID) {
		super();
		this.name = name;
		this.id = id;
		this.openID = openID;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getOpenID() {
		return openID;
	}

	public void setOpenID(String openID) {
		this.openID = openID;
	}
}
