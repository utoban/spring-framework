package com.atguigu;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Ext  {


	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);
		applicationContext.publishEvent(new ApplicationEvent(new String("111")) {
		});
		
		applicationContext.close();
	}

	/*public static void main(String args[]) {
		System.out.println("test");
	}*/

}
