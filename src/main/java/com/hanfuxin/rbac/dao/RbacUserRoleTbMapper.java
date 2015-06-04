package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacUserRoleTb;

public interface RbacUserRoleTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacUserRoleTb record);

	int insertSelective(RbacUserRoleTb record);

	RbacUserRoleTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacUserRoleTb record);

	int updateByPrimaryKey(RbacUserRoleTb record);
}