package com.hanfuxin.rbac.model;

public class RbacUserRoleTb {
	private String id;

	private String usergroupid;

	private String rolegroupid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getUsergroupid() {
		return usergroupid;
	}

	public void setUsergroupid(String usergroupid) {
		this.usergroupid = usergroupid == null ? null : usergroupid.trim();
	}

	public String getRolegroupid() {
		return rolegroupid;
	}

	public void setRolegroupid(String rolegroupid) {
		this.rolegroupid = rolegroupid == null ? null : rolegroupid.trim();
	}
}