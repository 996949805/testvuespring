package com.lao.vuespring;

import com.lao.vuespring.pojo.User;
import com.lao.vuespring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VuespringApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
		User user= userService.getByName("admin");
		System.out.println(user);
	}

}
