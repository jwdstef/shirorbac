package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacUrlTb;

public interface RbacUrlTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacUrlTb record);

	int insertSelective(RbacUrlTb record);

	RbacUrlTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacUrlTb record);

	int updateByPrimaryKey(RbacUrlTb record);
}