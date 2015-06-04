package com.hanfuxin.rbac.model;

public class RbacAccessButtonTb {
	private String id;

	private String accessgroupid;

	private String buttonid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getAccessgroupid() {
		return accessgroupid;
	}

	public void setAccessgroupid(String accessgroupid) {
		this.accessgroupid = accessgroupid == null ? null : accessgroupid.trim();
	}

	public String getButtonid() {
		return buttonid;
	}

	public void setButtonid(String buttonid) {
		this.buttonid = buttonid == null ? null : buttonid.trim();
	}
}