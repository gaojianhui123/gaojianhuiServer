package com.sanyi.framework;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.sanyi.framework.model.ProtectedResource;
import com.sanyi.framework.model.User;
import com.sanyi.framework.page.QueryParam;

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
