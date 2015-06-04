package com.hanfuxin.rbac.model;

public class RbacAccessTableTb {
	private String id;

	private String accessgroupid;

	private String tableid;

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

	public String getTableid() {
		return tableid;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid == null ? null : tableid.trim();
	}
}