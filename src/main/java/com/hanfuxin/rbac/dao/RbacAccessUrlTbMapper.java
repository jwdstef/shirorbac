package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacAccessUrlTb;

public interface RbacAccessUrlTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacAccessUrlTb record);

	int insertSelective(RbacAccessUrlTb record);

	RbacAccessUrlTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacAccessUrlTb record);

	int updateByPrimaryKey(RbacAccessUrlTb record);
}