package com.hanfuxin.rbac.model;

public class RbacRoleAccessTb {
	private String id;

	private String rolegroupid;

	private String accessgroupid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getRolegroupid() {
		return rolegroupid;
	}

	public void setRolegroupid(String rolegroupid) {
		this.rolegroupid = rolegroupid == null ? null : rolegroupid.trim();
	}

	public String getAccessgroupid() {
		return accessgroupid;
	}

	public void setAccessgroupid(String accessgroupid) {
		this.accessgroupid = accessgroupid == null ? null : accessgroupid.trim();
	}
}