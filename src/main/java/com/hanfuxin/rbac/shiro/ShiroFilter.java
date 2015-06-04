package com.hanfuxin.rbac.shiro;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import com.hanfuxin.rbac.model.RbacRoleTb;
import com.hanfuxin.rbac.model.RbacUserTb;

public class ShiroFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		Principal principal = httpRequest.getUserPrincipal();
		if (null != principal) {
			Subject subjects = SecurityUtils.getSubject();
			RbacUserTb user = new RbacUserTb();
			user.setUsername("1");
			user.setPassword("1");
			List<RbacRoleTb> rbacRoleTbs = new ArrayList<RbacRoleTb>();
			RbacRoleTb rbacRoleTb = new RbacRoleTb();
			rbacRoleTb.setRolename("remember");

			rbacRoleTbs.add(rbacRoleTb);
			user.setRbacRoleTbs(rbacRoleTbs);
			if (user.getUsername().equals(principal.getName())) {
				UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
				subjects = SecurityUtils.getSubject();
				subjects.login(token);
				subjects.getSession();
			} else {
				if (null != subjects) {
					subjects.logout();
				}
			}
		}
		chain.doFilter(httpRequest, httpResponse);
	}

	@Override
	public void destroy() {

	}

}
