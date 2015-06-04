package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacAccessGroupTb;

public interface RbacAccessGroupTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacAccessGroupTb record);

	int insertSelective(RbacAccessGroupTb record);

	RbacAccessGroupTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacAccessGroupTb record);

	int updateByPrimaryKey(RbacAccessGroupTb record);
}