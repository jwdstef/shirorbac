package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacRoleTb;

public interface RbacRoleTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacRoleTb record);

	int insertSelective(RbacRoleTb record);

	RbacRoleTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacRoleTb record);

	int updateByPrimaryKey(RbacRoleTb record);
}