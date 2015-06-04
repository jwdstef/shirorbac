package com.hanfuxin.rbac.model;

public class RbacAccessUrlTb {
	private String id;

	private String accessgroupid;

	private String urlid;

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

	public String getUrlid() {
		return urlid;
	}

	public void setUrlid(String urlid) {
		this.urlid = urlid == null ? null : urlid.trim();
	}
}