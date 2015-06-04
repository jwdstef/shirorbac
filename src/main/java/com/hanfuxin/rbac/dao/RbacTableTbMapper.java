package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacTableTb;

public interface RbacTableTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacTableTb record);

	int insertSelective(RbacTableTb record);

	RbacTableTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacTableTb record);

	int updateByPrimaryKey(RbacTableTb record);
}