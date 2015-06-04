package com.hanfuxin.rbac.model;

public class RbacTableTb {
	private String id;

	private String tableid;

	private String tablename;

	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getTableid() {
		return tableid;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid == null ? null : tableid.trim();
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename == null ? null : tablename.trim();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc == null ? null : desc.trim();
	}
}