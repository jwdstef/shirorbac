package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacRoleAccessTb;

public interface RbacRoleAccessTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacRoleAccessTb record);

	int insertSelective(RbacRoleAccessTb record);

	RbacRoleAccessTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacRoleAccessTb record);

	int updateByPrimaryKey(RbacRoleAccessTb record);
}