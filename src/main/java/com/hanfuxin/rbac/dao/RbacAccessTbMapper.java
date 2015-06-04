package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacAccessTb;

public interface RbacAccessTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacAccessTb record);

	int insertSelective(RbacAccessTb record);

	RbacAccessTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacAccessTb record);

	int updateByPrimaryKey(RbacAccessTb record);
}