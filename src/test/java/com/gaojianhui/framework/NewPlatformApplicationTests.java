package com.gaojianhui.framework;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewPlatformApplicationTests {
	@Test
	public void contextLoads() {
	}

	@Test
	public void test() {
		System.err.println(0%2);
		System.err.println(1%2);
		System.err.println(2%2);
		System.err.println(3%2);
		System.err.println(4%2);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String currentDate = df.format(new Date());
		System.out.println(currentDate);
		
	}

}
