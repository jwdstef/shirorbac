package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacUserTb;

public interface RbacUserTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacUserTb record);

	int insertSelective(RbacUserTb record);

	RbacUserTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacUserTb record);

	int updateByPrimaryKey(RbacUserTb record);
}