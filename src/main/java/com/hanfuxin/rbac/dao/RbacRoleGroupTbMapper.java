package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacRoleGroupTb;

public interface RbacRoleGroupTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacRoleGroupTb record);

	int insertSelective(RbacRoleGroupTb record);

	RbacRoleGroupTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacRoleGroupTb record);

	int updateByPrimaryKey(RbacRoleGroupTb record);
}