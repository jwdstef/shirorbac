package com.hanfuxin.rbac.model;

public class RbacTableColumnTb {
	private String id;

	private String columnname;

	private String tableid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getColumnname() {
		return columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname == null ? null : columnname.trim();
	}

	public String getTableid() {
		return tableid;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid == null ? null : tableid.trim();
	}
}