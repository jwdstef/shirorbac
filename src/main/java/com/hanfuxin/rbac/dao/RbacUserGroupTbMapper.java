package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacUserGroupTb;

public interface RbacUserGroupTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacUserGroupTb record);

	int insertSelective(RbacUserGroupTb record);

	RbacUserGroupTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacUserGroupTb record);

	int updateByPrimaryKey(RbacUserGroupTb record);
}