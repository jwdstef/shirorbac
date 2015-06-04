package com.hanfuxin.rbac.model;

public class RbacAccessTb {
	private String id;

	private String accessname;

	private String accessid;

	private String accessgroupid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getAccessname() {
		return accessname;
	}

	public void setAccessname(String accessname) {
		this.accessname = accessname == null ? null : accessname.trim();
	}

	public String getAccessid() {
		return accessid;
	}

	public void setAccessid(String accessid) {
		this.accessid = accessid == null ? null : accessid.trim();
	}

	public String getAccessgroupid() {
		return accessgroupid;
	}

	public void setAccessgroupid(String accessgroupid) {
		this.accessgroupid = accessgroupid == null ? null : accessgroupid.trim();
	}
}