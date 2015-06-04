package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacAccessTableTb;

public interface RbacAccessTableTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacAccessTableTb record);

	int insertSelective(RbacAccessTableTb record);

	RbacAccessTableTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacAccessTableTb record);

	int updateByPrimaryKey(RbacAccessTableTb record);
}