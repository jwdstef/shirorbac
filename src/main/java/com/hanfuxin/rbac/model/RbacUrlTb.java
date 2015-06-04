package com.hanfuxin.rbac.model;

public class RbacUrlTb {
	private String id;

	private String urlname;

	private String fullurl;

	private String shorturl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getUrlname() {
		return urlname;
	}

	public void setUrlname(String urlname) {
		this.urlname = urlname == null ? null : urlname.trim();
	}

	public String getFullurl() {
		return fullurl;
	}

	public void setFullurl(String fullurl) {
		this.fullurl = fullurl == null ? null : fullurl.trim();
	}

	public String getShorturl() {
		return shorturl;
	}

	public void setShorturl(String shorturl) {
		this.shorturl = shorturl == null ? null : shorturl.trim();
	}
}