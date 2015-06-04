package rbac.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hanfuxin.rbac.model.RbacUserTb;
import com.hanfuxin.rbac.service.RbacUserTbService;

public class TestMybatis {
	private ApplicationContext ac;
	private RbacUserTbService userService;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext(new String[] {
				"spring.xml", "spring-mybatis.xml"
		});
		userService = (RbacUserTbService) ac.getBean("rbacUserTbService");
	}

	@Test
	public void test1() {
		RbacUserTb entity = userService.getUserById("1");
		System.out.println(entity.getEmail());
	}

	@Test
	public void test2() {

	}
}
