package com.fyts.core.modules.sys.entity;

import com.fyts.core.common.base.SysEntity;

public class Admin extends SysEntity<Admin> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String account;
	
	private Integer age;
	
	private String password;
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
