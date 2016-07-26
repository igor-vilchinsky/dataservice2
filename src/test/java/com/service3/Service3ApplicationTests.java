package com.service3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.datacenter.Service3Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Service3Application.class)
@WebAppConfiguration
public class Service3ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
