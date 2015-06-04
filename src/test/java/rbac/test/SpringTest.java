package rbac.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.hanfuxin.rbac.model.RbacUserTb;
import com.hanfuxin.rbac.service.RbacUserTbService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring.xml", "classpath:spring-mybatis.xml"
})
public class SpringTest {
	@Autowired
	private RbacUserTbService userService;
	private static final Logger logger = Logger.getLogger(SpringTest.class);

	@Test
	public void getUser() {
		RbacUserTb u = userService.getUserById("1");
		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd"));
	}
}
