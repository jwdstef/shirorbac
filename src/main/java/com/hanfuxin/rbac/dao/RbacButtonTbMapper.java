package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacButtonTb;

public interface RbacButtonTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacButtonTb record);

	int insertSelective(RbacButtonTb record);

	RbacButtonTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacButtonTb record);

	int updateByPrimaryKey(RbacButtonTb record);
}