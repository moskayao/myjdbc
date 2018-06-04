package com.ZGY.jdbc01.pojo;

import java.sql.Timestamp;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String phone;
	private String addr;
	private Timestamp rdate;
	public User() {
		super();
	}
	public User(Integer id, String username, String password, String phone, String addr, Timestamp rdate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.addr = addr;
		this.rdate = rdate;
	}
	
	public User(String username, String password, String phone, String addr) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.addr = addr;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (rdate == null) {
			if (other.rdate != null)
				return false;
		} else if (!rdate.equals(other.rdate))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public String getAddr() {
		return addr;
	}
	public Integer getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	public Timestamp getRdate() {
		return rdate;
	}
	public String getUsername() {
		return username;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((rdate == null) ? 0 : rdate.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setRdate(Timestamp rdate) {
		this.rdate = rdate;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", addr="
				+ addr + ", rdate=" + rdate + "]";
	}
	
	
}
