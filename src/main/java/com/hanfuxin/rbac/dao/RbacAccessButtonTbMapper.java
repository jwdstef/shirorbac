package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacAccessButtonTb;

public interface RbacAccessButtonTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacAccessButtonTb record);

	int insertSelective(RbacAccessButtonTb record);

	RbacAccessButtonTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacAccessButtonTb record);

	int updateByPrimaryKey(RbacAccessButtonTb record);
}