package com.gaojianhui.framework;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import java.util.UUID;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewPlatformApplicationTests {
	@Test
	public void contextLoads() {
	}

	@Test
	public void test() {
		String myText = "111111";
		String mima = UUID.nameUUIDFromBytes((myText).getBytes()).toString();
		System.out.println(mima);
		
	}

}
