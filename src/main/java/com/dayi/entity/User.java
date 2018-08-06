package com.dayi.entity;

public class User {
	private String uname;
	private String upassword;
	private String unick;
	private Integer uage;
	private String usex;
	private Integer id;
	
	public Long getId(long id) {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUnick() {
		return unick;
	}

	public void setUnick(String unick) {
		this.unick = unick;
	}

	public Integer getUage() {
		return uage;
	}

	public void setUage(Integer uage) {
		this.uage = uage;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	
	public User() {
		super();
	}

	public User(Integer id, String uname, String upassword, String unick,
			Integer uage, String usex) {
		super();
		this.id = id;
		this.uname = uname;
		this.upassword = upassword;
		this.unick = unick;
		this.uage = uage;
		this.usex = usex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upassword="
				+ upassword + ", unick=" + unick + ", uage=" + uage + ", usex="
				+ usex + "]";
	}
	
	
}
