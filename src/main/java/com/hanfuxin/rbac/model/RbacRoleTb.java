package com.hanfuxin.rbac.model;

public class RbacRoleTb {
	private String id;

	private String rolegroupid;

	private String rolename;

	private String roleid;

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

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename == null ? null : rolename.trim();
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid == null ? null : roleid.trim();
	}
}