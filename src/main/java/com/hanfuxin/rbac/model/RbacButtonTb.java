package com.hanfuxin.rbac.model;

public class RbacButtonTb {
	private String id;

	private String buttonname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getButtonname() {
		return buttonname;
	}

	public void setButtonname(String buttonname) {
		this.buttonname = buttonname == null ? null : buttonname.trim();
	}
}