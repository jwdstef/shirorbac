package com.hanfuxin.rbac.model;

public class RbacRoleGroupTb {
	private String id;

	private String name;

	private String desc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc == null ? null : desc.trim();
	}
}