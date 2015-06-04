package com.hanfuxin.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.hanfuxin.rbac.model.RbacUserTb;
import com.hanfuxin.rbac.service.RbacUserTbService;

public class CacheManager implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private RbacUserTbService rbacUserTbService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (null == event.getApplicationContext().getParent()) {
			RbacUserTb u = rbacUserTbService.getUserById("1");
			System.out.println(u.getEmail());
		}
	}

}
