package com.hanfuxin.rbac.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanfuxin.rbac.dao.RbacUserTbMapper;
import com.hanfuxin.rbac.model.RbacUserTb;
import com.hanfuxin.rbac.service.RbacUserTbService;

@Service("rbacUserTbService")
public class RbacUserTbServiceImpl implements RbacUserTbService {
	@Autowired
	private RbacUserTbMapper rbacUserTbMapper;

	public RbacUserTb getUserById(String id) {
		return rbacUserTbMapper.selectByPrimaryKey(id);
	}

}
