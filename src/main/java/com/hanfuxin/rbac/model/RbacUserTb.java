package com.hanfuxin.rbac.model;

import java.util.Date;
import java.util.List;

public class RbacUserTb {
	private String id;

	private String userid;

	private String usergroupid;

	private String username;

	private String password;

	private String email;

	private String phone;

	private String nicheng;

	private String deptid;

	private String status;

	private Date lastlogintime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid == null ? null : userid.trim();
	}

	public String getUsergroupid() {
		return usergroupid;
	}

	public void setUsergroupid(String usergroupid) {
		this.usergroupid = usergroupid == null ? null : usergroupid.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getNicheng() {
		return nicheng;
	}

	public void setNicheng(String nicheng) {
		this.nicheng = nicheng == null ? null : nicheng.trim();
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid == null ? null : deptid.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Date getLastlogintime() {
		return lastlogintime;
	}

	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	/**
	 * 非数据库字段放下面
	 */
	private List<RbacRoleTb> rbacRoleTbs;

	public List<RbacRoleTb> getRbacRoleTbs() {
		return rbacRoleTbs;
	}

	public void setRbacRoleTbs(List<RbacRoleTb> rbacRoleTbs) {
		this.rbacRoleTbs = rbacRoleTbs;
	}

}