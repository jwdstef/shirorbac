package com.hanfuxin.rbac.dao;

import com.hanfuxin.rbac.model.RbacTableColumnTb;

public interface RbacTableColumnTbMapper {
	int deleteByPrimaryKey(String id);

	int insert(RbacTableColumnTb record);

	int insertSelective(RbacTableColumnTb record);

	RbacTableColumnTb selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(RbacTableColumnTb record);

	int updateByPrimaryKey(RbacTableColumnTb record);
}