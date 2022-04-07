package com.javatest.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Pencil pencil = ctx.getBean("pencil", Pencil.class); // mainclass 코드 수정 없이, 컨피그파일 수정해서 사용
		
		pencil.use();
		ctx.close();
		
	}

}
