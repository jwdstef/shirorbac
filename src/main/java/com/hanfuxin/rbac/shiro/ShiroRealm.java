package com.hanfuxin.rbac.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.hanfuxin.rbac.model.RbacRoleTb;
import com.hanfuxin.rbac.model.RbacUserTb;

public class ShiroRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		if (null == principals) {
			throw new AuthorizationException("principal这个参数不能为空");
		}
		String name = (String) getAvailablePrincipal(principals);
		List<String> roles = new ArrayList<String>();
		RbacUserTb user = new RbacUserTb();
		RbacRoleTb rbacRoleTb = new RbacRoleTb();
		rbacRoleTb.setRolename("member");
		List<RbacRoleTb> rbacRoleTbs = new ArrayList<RbacRoleTb>();
		rbacRoleTbs.add(rbacRoleTb);
		if (user.getUsername().equals(name) && null != user.getRbacRoleTbs() && user.getRbacRoleTbs().size() > 0) {
			for (RbacRoleTb role : user.getRbacRoleTbs()) {
				roles.add(role.getRolename());
			}
		} else {
			throw new AuthorizationException();
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRoles(roles);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken tokenThis = (UsernamePasswordToken) token;
		RbacUserTb user = new RbacUserTb();
		user.setUsername("1");
		user.setPassword("1");
		SimpleAuthenticationInfo info = null;
		if (user.getUsername().equals(tokenThis.getUsername())) {
			info = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());

		}
		return info;
	}

}
